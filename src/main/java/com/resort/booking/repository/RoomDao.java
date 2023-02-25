package com.resort.booking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.resort.booking.model.Room;


@Repository
public interface RoomDao extends CrudRepository<Room, Integer>  {

}
