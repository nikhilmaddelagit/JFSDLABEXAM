package com.klef.jfsd.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;



@Entity
public class Truck extends Vehicle 
{
	@Column(name = "Load Capacity")
	private int loadcapacity;

	public int getLoadcapacity() {
		return loadcapacity;
	}

	public void setLoadcapacity(int loadcapacity) {
		this.loadcapacity = loadcapacity;
	}

}
