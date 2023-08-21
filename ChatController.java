@RestController
public class ChatController {

    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public Message sendMessage(Message message) {
        return message;
    }
}
