package com.tns.service;
import com.tns.entities.placement;
public interface PlacementService {


	    public abstract void addPlacement(placement placement);
		
		public abstract void updatePlacement(placement placement);
		
		public abstract void searchPlacement(long id);
		
		public abstract void cancelPlacement(long id);
	}

