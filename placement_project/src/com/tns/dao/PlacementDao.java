package com.tns.dao;
import java.util.*;
import com.tns.entities.placement;
public interface PlacementDao {
	
		public abstract void addPlacement(placement placement);
		
		public abstract void updatePlacement(placement placement);
		
		public abstract placement searchPlacement(long id);

		void beginTrancsaction();

		void cancelPlacement(long id);

		void commitTransaction();
	}

