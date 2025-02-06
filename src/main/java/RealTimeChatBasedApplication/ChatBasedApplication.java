package RealTimeChatBasedApplication;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories(basePackages = "RealTimeChatBasedApplication.RoomRepository")
public class ChatBasedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatBasedApplication.class, args);

	}

}
