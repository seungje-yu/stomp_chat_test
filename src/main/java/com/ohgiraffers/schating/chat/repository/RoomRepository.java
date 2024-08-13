package com.ohgiraffers.schating.chat.repository;


import com.ohgiraffers.schating.chat.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
