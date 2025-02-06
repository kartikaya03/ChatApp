package RealTimeChatBasedApplication.services.impl;

import RealTimeChatBasedApplication.pojo.Message;
import RealTimeChatBasedApplication.pojo.Room;
import RealTimeChatBasedApplication.RoomRepository.Repo;

import RealTimeChatBasedApplication.services.interfaces.ChatRoomService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;


import java.util.Collections;
import java.util.List;


@Service
@Slf4j
public class ChatRoomServiceImpl implements ChatRoomService {


    private final Repo roomRepository;

   public ChatRoomServiceImpl(Repo repository){
       this.roomRepository=repository;

   }

    @Override
    public ResponseEntity<?> createRoom(String roomId) {
        if (roomRepository.findByRoomId(roomId) != null) {
            return ResponseEntity.badRequest().body("Room already exists!");
        }

        Room room = new Room();
        room.setRoomId(roomId);
        Room savedRoom = roomRepository.save(room);

        log.info("Room created: {}", savedRoom);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRoom);
    }
 //join room
    @Override
    public ResponseEntity<?> joinRoom(String roomId) {

       Room room = roomRepository.findByRoomId(roomId);

       if(room==null){
           return ResponseEntity.badRequest().body("Room not found");
       }

     log.info("Room joined: {}", room);
      return ResponseEntity.ok(room);

    }

    @Override
    public ResponseEntity<List<Message>> getMessage(String roomId, int page, int size) {
        Room room = roomRepository.findByRoomId(roomId);
        if (room == null) {
            return ResponseEntity.badRequest().build();
        }

        List<Message> messages = room.getMessages();

        // Ensure page starts from 0 (zero-based index)
        if (page < 1) {
            return ResponseEntity.badRequest().build();
        }

        int start = (page - 1) * size;
        int end = Math.min(start + size, messages.size());

        // Check for out-of-bounds
        if (start >= messages.size()) {
            return ResponseEntity.ok(Collections.emptyList()); // Return empty list if page exceeds size
        }

        List<Message> paginatedMessages = messages.subList(start, end);
        return ResponseEntity.ok(paginatedMessages);
    }


}










