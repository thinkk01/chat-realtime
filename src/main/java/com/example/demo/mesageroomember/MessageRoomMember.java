package com.example.demo.mesageroomember;

import com.example.demo.messageroom.MessageRoom;
import com.example.demo.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="message_rooom_member")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(MessageRoomMemberKey.class)
public class MessageRoomMember {
    @Id
    @ManyToOne
    @JoinColumn(name="message_room")
    private MessageRoom messageRoom;

    @Id
    @ManyToOne
    @JoinColumn(name="username")
    private User user;

    private Boolean isAdmin;
    private LocalDateTime lastSeen;
}
