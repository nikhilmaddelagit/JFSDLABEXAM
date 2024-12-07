package com.klef.jfsd.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle
{
	@Column(length = 50, name = "Number Of Doors")
	private int numberofdoors;

	public int getNumberofdoors() {
		return numberofdoors;
	}

	public void setNumberofdoors(int numberofdoors) {
		this.numberofdoors = numberofdoors;
	}
	
	
}
