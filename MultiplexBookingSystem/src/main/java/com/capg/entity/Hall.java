package com.capg.entity;

import javax.persistence.*;

@Entity
@Table(name="hall")
public class Hall {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="hall_id")
	private long id;
	
	@Column(name="seat_number")
	private int seatNumber;
	
	public Hall() {}

	public Hall(long id, int seatNumber) {
		super();
		this.id = id;
		this.seatNumber = seatNumber;

	}

	public long getId() {
		return id;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}


	@Override
	public String toString() {
		return "Hall [id=" + id + ", seatNumber=" + seatNumber +  "]";
	}

	

}
