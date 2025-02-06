package RealTimeChatBasedApplication.services.interfaces;



import RealTimeChatBasedApplication.pojo.Message;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface ChatRoomService {

    ResponseEntity<?> createRoom(String roomId);
    ResponseEntity<?> joinRoom(String roomId);
    ResponseEntity<List<Message>> getMessage(String roomId,int page, int size);

}
