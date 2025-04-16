package com.example.demo.mesageroomember;

import com.example.demo.messageroom.MessageRoom;
import com.example.demo.user.User;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageRoomMemberDTO {
    private MessageRoom messageRoom;
    private String username;
    private Boolean isAdmin;
    private LocalDateTime lastSeen;
}
