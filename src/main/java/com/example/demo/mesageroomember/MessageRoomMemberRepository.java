package com.example.demo.mesageroomember;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRoomMemberRepository extends JpaRepository<MessageRoomMemberKey, MessageRoomMemberKey> {
}
