package com.tns.dao;
import javax.persistence.EntityManager;
import com.tns.entities.placement;
public class PlacementDaoImpl implements PlacementDao {
			
			private EntityManager entityManager;

			public PlacementDaoImpl() {
				
				entityManager = JPAUtil.getEntityManager();
			}
			
			@Override
			public void addPlacement(placement placement) {
			
				entityManager.persist(placement);
			}

			@Override
			public void updatePlacement(placement placement) {
				
				entityManager.merge(placement);
				
			}
			@Override
			public placement searchPlacement(long id) {
				
				placement placement = entityManager.find(placement.class, id);
				return placement;
			}
			
			@Override
			public void cancelPlacement(long id)
			{
				placement placement = entityManager.find(placement.class, id);
				entityManager.remove(placement);
			}
			
			@Override
			public void beginTrancsaction() {
				entityManager.getTransaction().begin();
				
			}

			@Override
			public void commitTransaction() {
				entityManager.getTransaction().commit();
				
			}
			
		
	}

