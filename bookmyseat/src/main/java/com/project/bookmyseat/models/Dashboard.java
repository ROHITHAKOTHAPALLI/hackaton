package com.project.bookmyseat.models;

import java.sql.Date;
import java.util.*;

import javax.persistence.*;

@Entity
public class Dashboard {
	
	@Id
	
	private Date bookingDate;
		
	private int totalSeats;
	
	private int seatsAvailable;
	
	public Dashboard() {
		
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	
	

}
