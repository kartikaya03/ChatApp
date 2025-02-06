package RealTimeChatBasedApplication.pojo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;



@Document(collection = "ChatAppRoom")
public class Room {

    public void setId(String id) {
        this.id = id;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public String getRoomId() {
        return roomId;
    }

    public List<Message> getMessages() {
        return messages;
    }

    private String roomId;

    private List<Message> messages = new ArrayList<>();


}
