package RealTimeChatBasedApplication.controller;



import RealTimeChatBasedApplication.pojo.Message;
import RealTimeChatBasedApplication.pojo.Room;


import RealTimeChatBasedApplication.services.interfaces.ChatRoomService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ChatRoom")
@Slf4j
public class ApiCalls {

    private ChatRoomService chatRoomService;

    public ApiCalls(ChatRoomService chatRoomService) {
        this.chatRoomService = chatRoomService;
    }


    @PostMapping("/Id")
    public ResponseEntity<?> createRoom(@RequestBody String roomId) {//controller for create a  room for chatting
        log.info("Creating room: {}", roomId);
        return chatRoomService.createRoom(roomId);
    }
    @GetMapping("/Id/{roomId}")
    public ResponseEntity<?> joinRoom(@PathVariable String roomId){
        log.info("Joining room: {}", roomId);
        return chatRoomService.joinRoom(roomId);
    }


      @GetMapping("/{roomId}/message")
    public ResponseEntity<List<Message>> getMessage(@PathVariable String roomId,
                                                    @RequestParam(value = "page",defaultValue = "0",required = false) int page,
                                                    @RequestParam(value = "size",defaultValue = "20",required = false) int size)
      {


           log.info("Getting messages for room: {}", roomId);

          return chatRoomService.getMessage(roomId,page,size);

    }



}


