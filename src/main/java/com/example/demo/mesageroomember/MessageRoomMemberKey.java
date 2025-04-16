package com.example.demo.mesageroomember;

import com.example.demo.messageroom.MessageRoom;
import com.example.demo.user.User;
import lombok.Data;

import java.io.Serializable;
@Data
public class MessageRoomMemberKey implements Serializable {
    private User user;
    private MessageRoom messageRoom;
}
