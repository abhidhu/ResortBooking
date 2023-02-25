package com.resort.booking.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.resort.booking.model.Room;
import com.resort.booking.service.RoomService;
import com.resort.booking.service.UserService;

@Controller
public class RoomController {

	@Autowired
	RoomService roomService;

	@PostMapping("/update_room")
	public String addRoom(@ModelAttribute("room") Room room, Model model) {

		System.out.println("Hello inside add_rooms");
		roomService.updateRoom(room);
		System.out.println(room);

		ArrayList<Room> rooms = (ArrayList<Room>) roomService.getAll();

		for (Room r : rooms) {

			model.addAttribute(r.getRoomName(), r.getPrice());
			model.addAttribute(r.getRoomName() + "a", r.getNoOfRooms());

		}

		return "admin";
	}

	@GetMapping("/rooms")
	public String rooms(Model model) {

		ArrayList<Room> rooms = (ArrayList<Room>) roomService.getAll();

		for (Room r : rooms) {
			model.addAttribute(r.getRoomName(), r.getPrice());
			model.addAttribute(r.getRoomName() + "a", r.getNoOfRooms());
		}

		return "rooms";
	}

	public String updateRoom() {

		return "admin_log";
	}

	public RoomController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoomController(RoomService roomService) {
		super();
		this.roomService = roomService;
	}

	public RoomService getRoomService() {
		return roomService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	@Override
	public String toString() {
		return "RoomController [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
