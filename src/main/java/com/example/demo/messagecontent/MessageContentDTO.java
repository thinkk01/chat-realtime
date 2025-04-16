package com.example.demo.messagecontent;

import com.example.demo.messageroom.EMessageType;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MessageContentDTO {
    private UUID id;
    private String content;
    private LocalDateTime dateSent;
    private EMessageType messageType;
    private UUID messageRoomId;
    private String sender;
}
