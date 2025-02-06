package RealTimeChatBasedApplication.RoomRepository;

import RealTimeChatBasedApplication.pojo.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Repo extends MongoRepository<Room, String> {

    Room findByRoomId(String name);
}
