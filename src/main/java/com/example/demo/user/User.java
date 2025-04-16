package com.example.demo.user;

import com.example.demo.messageroom.MessageRoom;
import com.example.demo.mesageroomember.MessageRoomMember;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private EUserStatus status;

    private LocalDateTime lastLogin = LocalDateTime.now();

    private String avatarUrl;

    @OneToMany(mappedBy = "createdBy")
    private List<MessageRoom> messageRoom;

    @OneToMany(mappedBy = "user")
    private List<MessageRoomMember> messageRoomMembers;
}

