package RealTimeChatBasedApplication.Controller;



import RealTimeChatBasedApplication.pojo.RoomCredentials;


import RealTimeChatBasedApplication.services.interfaces.ChatRoomService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ApiCalls {

   private ChatRoomService chatRoomService;

    public ApiCalls(ChatRoomService chatRoomService) {
        this.chatRoomService = chatRoomService;
    }


    @PostMapping("/Id")
    public RoomCredentials createRoom(@RequestBody String roomId) {       //controller for create a  room for chatting
              chatRoomService.createRoom(roomId);
        return  null;
    }

    @GetMapping
    public String joinRoom(String roomId) {
        return null;
    }
}

