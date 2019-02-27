package io.workCreateDemo.Create;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ampmController {

	private Calendar getCalendar(int day,int month, int year) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month);
        c.set(Calendar.DAY_OF_MONTH,day);
        return c;
    }
    @Autowired
    private workService service;
	
    @Autowired
    private RestTemplate resttemplate;
    
    @RequestMapping(value="/findall",method=RequestMethod.GET)
    public List<ampmitem> getAllWork() {
        return service.findAll();
    }
    @RequestMapping(value="/notifylist",method=RequestMethod.POST)
    public void getNotiyfingList(@RequestBody ampmitem amp) {
        catalist cataList = resttemplate.getForObject("http://localhost:8084/atow/"+amp.getAssetid(), catalist.class);
    	String str1= "AM";
    	String str2 = "PM";
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
        List<String> notifilist = new ArrayList<>();
        String startDate;
        
        if(amp.getTypeofmain().equals(str1)) {
        				service.save(amp);
        			 c.add(Calendar.MONTH, 6);
        		     String dateformat2=dateFormat.format(c.getTime());
        		     amp.setNotifydate(dateformat2);
        		     c.add(Calendar.MONTH, 6);
        		      startDate = dateFormat.format(c.getTime());
        		      workitem wrk = new workitem();
        		      	//id madhe jhol
        		      	wrk.setId("100");
        				wrk.setTitle("Work on "+amp.getAssetid());
        				wrk.setDescription(amp.getWorkdetails());
        				wrk.setMachinename(cataList.getMname());
        				service.addWork(wrk);
        		     amp.setStartdate(dateFormat.format(c.getTime()));
        		     service.save(amp);
        }
        if(amp.getTypeofmain().equals(str2)) {
        	List<Calendar> forStartDate = new ArrayList<Calendar>();
        	c.add(Calendar.MONTH, 3);
        	notifilist.add(dateFormat.format(c.getTime()));
        	forStartDate.add(c);
        	do {
        			 c.add(Calendar.MONTH, 6);
        		     String dateformat2=dateFormat.format(c.getTime());
        		     notifilist.add(dateformat2);
        		     forStartDate.add(c);
        		}while(d.before(c));
        	workitem wrk = new workitem();
 			wrk.setTitle("Work on "+amp.getAssetid());
 			wrk.setDescription(amp.getWorkdetails());
 			String sd = dateFormat.format(forStartDate.get(0));
 			wrk.setId("101");
 			wrk.setStartDate(sd);
 			wrk.setMachinename(cataList.getMname());
 			service.addWork(wrk);
 			amp.setNotifydate(notifilist.get(0));	
 			service.save(amp);
        	 		for(int i=1;i<notifilist.size();i++) {
        	 			workitem wrkk = new workitem();
        	 			wrkk.setId("105");
        	 			wrkk.setTitle("Work on "+amp.getAssetid());
        	 			wrkk.setDescription(amp.getWorkdetails());
        	 			String sdd = dateFormat.format(forStartDate.get(0));
        	 			wrkk.setStartDate(sd);
        	 			wrkk.setMachinename(cataList.getMname());
        	 			service.addWork(wrk);
        	 			amp.setNotifydate(notifilist.get(i));	
        	 			service.save(amp);
        	 		}
        }
    }
	
}
