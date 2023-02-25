package com.resort.booking.service;

import java.util.List;

import com.resort.booking.model.Room;

public interface RoomService {
	
	public void  addRoom(Room room);
	
	public void  updateRoom(Room room);
	
	public List<Room> getAll();
	
}
