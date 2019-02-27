package io.AssetDisplay.subcompdisplay;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

public interface subcompcatalogRepository extends CrudRepository<subcompcatalog, String>{
	public List<subcompcatalog> findByCatCompid(String mid);
}
