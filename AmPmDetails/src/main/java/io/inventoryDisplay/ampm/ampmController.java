package io.inventoryDisplay.ampm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ampm")
public class ampmController {
    private Calendar getCalendar(int day,int month, int year) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month);
        c.set(Calendar.DAY_OF_MONTH,day);
        return c;
    }
    
    @Autowired
    private ampmService ampmService;

    @Autowired
    private RestTemplate resttemplate;
    @RequestMapping(value="/findall",method=RequestMethod.GET,produces= {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public List<ampmitems> getAllWork() {
        return ampmService.findAll();
    }
    @RequestMapping(value="/notifylist",method=RequestMethod.GET)
    public notifylist getNotiyfingList(@RequestBody ampmitems amp) {
    	String type = amp.getTypeofmain();
    	String dateInString = amp.getStartdate();
        String date[] = dateInString.split("-");
        int month=Integer.parseInt(date[0]);
        int day=Integer.parseInt(date[1]);
        int year=Integer.parseInt(date[2]);
        String enddate = amp.getEnddate();
        String enddates[] = enddate.split("-");
        int month1=Integer.parseInt(enddates[0]);
        int day1=Integer.parseInt(enddates[1]);
        int year1=Integer.parseInt(enddates[2]);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = getCalendar(day,month,year);
        Calendar d = getCalendar(day1,month1,year1);
        List<String> list = new ArrayList<>();
        if(type=="AM") {
        			 c.add(Calendar.MONTH, 6);
        		     String dateformat2=dateFormat.format(c.getTime());
        		     list.add(dateformat2);
        		     amp.setNotifydate(list);
        		     ampmService.save(amp);
        }
        if(type=="PM") {
        	do {
        			 c.add(Calendar.MONTH, 3);
        		     String dateformat2=dateFormat.format(c.getTime());
        		     list.add(dateformat2);
        		}while(d.before(c));
	
        		     amp.setNotifydate(list);	
        		     ampmService.save(amp);
        }
        notifylist notifi = new notifylist();
        notifi.initData(amp.getAssetid(),amp.getWorkdetails(),amp.getNotifydate());
        return notifi;
    }
    /*@RequestMapping("/ads")
    public void createworkforampm() {
    	notifylist noti = resttemplate.getForObject("http://localhost:9001/ampm/notifylist", notifylist.class);
    	catalist cataList = resttemplate.getForObject("http://localhost:9001/atow/"+noti.getAssetid(), catalist.class);
    	for(int i=0;i<noti.getNotify().size();i++) {
    		workItem wrk = new workItem();
    		wrk.setTitle("Work on "+noti.getAssetid());
    		wrk.setDescription(noti.getWorkdetails());	
    		wrk.setDueDate(noti.getNotify().get(i));
    		wrk.setMachinename(cataList.getMname());
    		ampmService.addWork(wrk);
    	}*/
}