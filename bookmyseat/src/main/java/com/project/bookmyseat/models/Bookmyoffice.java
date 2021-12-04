package com.project.bookmyseat.models;

import java.sql.Date;
import java.util.*;
import javax.persistence.*;

@Entity



public class Bookmyoffice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookindId;
	
	@Column(
			nullable=false
			)
	private Date bookingDate;
	
	
	private int floorId;
	
	
	private int portId;
	
	
	private int deskId;
	@OneToOne
    @JoinColumn(name="empId")

	private Employee employee;			
	private int managerId;
	
	
	
	public Bookmyoffice() {
		
	}


	public Date getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}


	public int getFloorId() {
		return floorId;
	}


	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}


	public int getPortId() {
		return portId;
	}


	public void setPortId(int portId) {
		this.portId = portId;
	}


	public int getDeskId() {
		return deskId;
	}


	public void setDeskId(int deskId) {
		this.deskId = deskId;
	}
	

}
