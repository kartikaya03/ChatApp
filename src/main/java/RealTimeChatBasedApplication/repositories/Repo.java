package RealTimeChatBasedApplication.repositories;

import RealTimeChatBasedApplication.pojo.RoomCredentials;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;

public interface Repo extends MongoRepository<RoomCredentials, String> {

    ResponseEntity<RoomCredentials> findByRoomId(String roomId);
}
