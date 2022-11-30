package com.kh.chat;

import lombok.Getter;
import lombok.Setter;

//여기서 구현(중요)
@Getter@Setter
public class ChatMessage {
//    누가 날렸는지, 채팅방 번호, 식별할 유저 아이디
//    enum 설정해놓은 값 말고는 못들어옴
    public enum MessageType{
//        채팅방 진입, 대화모드,
        ENTER, TALK
    }
    private MessageType type;
    private String roomId;
    private String sender;
    private String message;

}
