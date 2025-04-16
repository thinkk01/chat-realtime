package com.example.demo.mesageroom;
import com.example.demo.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "message_content")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Builder
public class MessageContent {
    @Id
    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    private UUID id;

    private String content;

    @CreatedDate
    private LocalDateTime dateSent;

    @Enumerated(EnumType.STRING)
    private EMessageType messageType;

    @ManyToOne
    @JoinColumn(name = "message_room_id")
    private MessageRoom messageRoom;

    @ManyToOne
    @JoinColumn(name = "username")
    private User user;
}
