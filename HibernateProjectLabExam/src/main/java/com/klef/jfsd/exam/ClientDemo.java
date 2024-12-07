package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo 
{
	
	public static void main(String args[])
	  {
		  Configuration cfg = new Configuration();
	  	  cfg.configure("hibernate.cfg.xml");
	  	
	  	  SessionFactory sf = cfg.buildSessionFactory();
	  	  Session session = sf.openSession();
	  	
	  	  Transaction t = session.beginTransaction();
	  	  
	  	  Vehicle v = new Vehicle();
	  	  v.setMaxspeed(100);
	  	  v.setColor("RED");
	  	  v.setName("Benz");
	  	  v.setType("car");
	  	
	  	  
	  	  Car c = new Car();
	  	  c.setColor("BLUE");
	  	  c.setMaxspeed(200);
	  	  c.setName("BMW");
	  	  c.setNumberofdoors(4);
	  	  c.setType("Car");
	  	 
	  	  
	  	  
	  	  
	  	  Truck tr = new Truck();
	  	  
	  	  tr.setLoadcapacity(50);
	  	  tr.setColor("ORANGE");
	  	  tr.setMaxspeed(200);
	  	  tr.setName("Honda");
	  	  tr.setType("Truck");
	  	  
	  	  session.persist(v);
	  	  session.persist(c);
	  	  session.persist(tr);
	  	 
	  	   t.commit();
	  	   System.out.println("SUCCESS....");
	  	
	  	   session.close();
	  	   sf.close();
	  }

}
