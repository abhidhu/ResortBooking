package com.resort.booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resort.booking.model.Room;
import com.resort.booking.repository.RoomDao;

@Service
public class RoomServiceImp implements RoomService {

	@Autowired
	RoomDao roomDao;

	@Override
	public void updateRoom(Room room) {

		ArrayList<Room> rooms = (ArrayList<Room>) this.getAll();
		
		room.setRoomName(room.getRoomName().toLowerCase()); 

		for (Room r : rooms) {

			if (r.getRoomName().equals(room.getRoomName())) {

				room.setId(r.getId());

				roomDao.save(room);

			}

		}

	}

	@Override
	public void addRoom(Room room) {

		roomDao.save(room);

	}

	public List<Room> getAll() {

		Iterable<Room> rooms = roomDao.findAll();

		List<Room> list = new ArrayList<>();

		rooms.forEach(e -> {
			list.add(e);
		});

		return list;
	}

	public RoomServiceImp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoomServiceImp(RoomDao roomDao) {
		super();
		this.roomDao = roomDao;
	}

	@Override
	public String toString() {
		return "RoomServiceImp [roomDao=" + roomDao + "]";
	}

	public RoomDao getRoomDao() {
		return roomDao;
	}

	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

}
