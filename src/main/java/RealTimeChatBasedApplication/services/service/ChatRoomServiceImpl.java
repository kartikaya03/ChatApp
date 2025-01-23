package RealTimeChatBasedApplication.services.service;

import RealTimeChatBasedApplication.pojo.RoomCredentials;
import RealTimeChatBasedApplication.repositories.Repo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ChatRoomServiceImpl implements RealTimeChatBasedApplication.services.interfaces.ChatRoomService {

    private Repo repo;

    public ChatRoomServiceImpl(Repo repo) {
        this.repo = repo;
    }

    @Override
    public ResponseEntity<String> createRoom(String roomId) {
          if(repo.findByRoomId(roomId)!=null) {
              return ResponseEntity.badRequest().body("Room already exists");
          }
       RoomCredentials room = new RoomCredentials();
          room.setRoomId(roomId);
          RoomCredentials savedRoom = repo.save(room);
          return ResponseEntity.status(HttpStatus.CREATED).body(savedRoom.getRoomId());
    }

    @Override
    public RoomCredentials joinRoom(String roomId) {
        return null;
    }
}
