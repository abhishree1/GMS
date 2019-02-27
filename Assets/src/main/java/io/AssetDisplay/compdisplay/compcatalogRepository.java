package io.AssetDisplay.compdisplay;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface compcatalogRepository extends CrudRepository<compcatalog, String>{
	public List<compcatalog> findByCatMid(String subid);
}
