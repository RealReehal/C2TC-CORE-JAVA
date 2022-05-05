package com.tns.service;
import com.tns.entities.placement;
import com.tns.dao.PlacementDao;
import com.tns.dao.PlacementDaoImpl;

		public class PlacementServiceImpl implements PlacementService{

		    private PlacementDao dao;
			
			public PlacementServiceImpl() {
				dao = new PlacementDaoImpl();
				
			}

			@Override
			public void addPlacement(placement placement) {
				dao.beginTrancsaction();
				dao.addPlacement(placement);
				dao.commitTransaction();
			}

			@Override
			public void updatePlacement(placement placement) {
				dao.beginTrancsaction();
				dao.updatePlacement(placement);
				dao.commitTransaction();
				
			}

			@Override
			public void searchPlacement(long id) {
				placement placement = dao.searchPlacement(id);
				return;
			}

			@Override
			public void cancelPlacement(long id) {
			  dao.beginTrancsaction();
			  dao.cancelPlacement(id);
			  dao.commitTransaction();
			}
		}
				
		
	


