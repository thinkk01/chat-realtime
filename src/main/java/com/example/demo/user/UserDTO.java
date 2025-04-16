package com.example.demo.user;

import com.example.demo.mesageroomember.MessageRoomMember;
import com.example.demo.messageroom.MessageRoom;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class UserDTO {
    private String username;
    private String password;
    private EUserStatus status;
    private LocalDateTime lastLogin = LocalDateTime.now();
    private String avatarUrl;
}
