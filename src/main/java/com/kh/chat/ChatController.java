package com.kh.chat;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
//첫번째 세션은 http로 연결해줘야함 => 그 다음 실제 채팅은 웹소켓으로
@CrossOrigin(origins = "http://localhost:3000")
public class ChatController {
    private final ChatService chatService;
    @PostMapping("/chat")
    public ResponseEntity<String> createRoom(@RequestBody String name) {
//        방번호가지고 채팅방 아이디 만듦
        ChatRoom room = chatService.createRoom(name);
        log.info(room.getRoomId());
        return new ResponseEntity<>(room.getRoomId(), HttpStatus.OK);
    }
}
