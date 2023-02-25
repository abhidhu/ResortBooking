package com.resort.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String roomName;
	private double price;
	private int noOfRooms;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	@Override
	public String toString() {
		return "Rooms [id=" + id + ", roomName=" + roomName + ", price=" + price + ", noOfRooms=" + noOfRooms + "]";
	}
	public Room(int id, String roomName, double price, int noOfRooms) {
		super();
		this.id = id;
		this.roomName = roomName;
		this.price = price;
		this.noOfRooms = noOfRooms;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
