package com.tns.client;
import com.tns.entities.*;
import java.time.*;
import com.tns.service.*;
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				//Debug this program as Debug -> Debug as Java Application 

				PlacementServiceImpl service = new PlacementServiceImpl();
		 	 	placement placement = new placement();
		 	 	placement.setidLong(205l);
				placement.setname("Tejashree");
				placement.setcollege("TSSM's BSCOER");
				placement.setdate("24 January");
				placement.setqualification("BE");
				placement.setyear(2017l);
				service.addPlacement(placement);
		 	 	
		 	 	 // Add Operation  	 	
		 	 	/*placement.setId(103);  	 	
		 	 	placement.setName("Trump"); 
		 	 	placement.setCollege("IIT");
		 	 	placement.setLocalDate("23/09//2022");
		 	 	placement.setQualification("Masters");
		 	 	placement.setYear(2022);
		 	 	service.addPlacement(placement);*/
		 	 	
		 	 	 // Update Operation
		 	 	/*placement = service.searchPlacementById(100);  	 	
		 	 	placement.setName("Vladimir Putin"); 
		 	 	placement.setCollege("IIT");
		 	 	placement.setLocalDate("23/09/2022");
		 	 	placement.setQualification("Masters");
		 	 	placement.setYear(2022);
		 	 	service.updatePlacement(placement);*/
		 	 	
		 	 	// Search Operation
		 	 	/*placement = service.searchPlacementById(102);
		 	 	System.out.println("Id---> "+placement.getId());
		 	 	System.out.println("Name---> "+placement.getName());
		 	 	System.out.println("College---> "+placement.getCollege());
		 	 	System.out.println("Date---> "+placement.getLocalDate());
		 	 	System.out.println("Qualification---> "+placement.getQualification());
		 	 	System.out.println("Year---> "+placement.getYear());*/
		 	 	
		 	 	// Cancel Operation
		 	 	/*placement = service.searchPlacementById(103); 	 	
		 	 	service.cancelPlacement(103);
		 	 	System.out.print("End of program/ Life cycle completed...");*/
		 	 	
			}
		
	}


