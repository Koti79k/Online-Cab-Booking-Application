package com.masai.Service;

import java.util.List;


import com.masai.Entity.Cab;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public interface CabService {
	
	public Cab insertCab(Cab cab);
	
	public Cab updateCab(Integer id,String type, Integer rate) throws NotFoundException;
	
	public List<String> viewCabsOfType() throws NotFoundException;
	
	public int countCabsOfType() throws NotFoundException;

}
