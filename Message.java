public class Message {
    private String from;
    private String content;

    // Default constructor
    public Message() {}

    // Parameterized constructor
    public Message(String from, String content) {
        this.from = from;
        this.content = content;
    }

    // Getter for 'from'
    public String getFrom() {
        return from;
    }

    // Setter for 'from'
    public void setFrom(String from) {
        this.from = from;
    }

    // Getter for 'content'
    public String getContent() {
        return content;
    }

    // Setter for 'content'
    public void setContent(String content) {
        this.content = content;
    }

    // toString method
    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
