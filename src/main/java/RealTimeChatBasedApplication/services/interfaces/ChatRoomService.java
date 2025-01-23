package RealTimeChatBasedApplication.services.interfaces;

import RealTimeChatBasedApplication.pojo.RoomCredentials;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface ChatRoomService {

    ResponseEntity<String> createRoom(String roomId);
    RoomCredentials joinRoom(String roomId);
}
