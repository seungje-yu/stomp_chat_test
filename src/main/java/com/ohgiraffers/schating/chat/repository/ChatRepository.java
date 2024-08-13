package com.ohgiraffers.schating.chat.repository;


import com.ohgiraffers.schating.chat.domain.Chat;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChatRepository extends CrudRepository<Chat, Long> {

    List<Chat> findAllByRoomId(Long roomId);
}
