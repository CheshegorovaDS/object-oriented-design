package message;

public class Message {
    private boolean isOutgoing;

    public Message(boolean isOutgoing) {
        this.isOutgoing = isOutgoing;
    }

    public boolean isOutgoing() {
        return isOutgoing;
    }

    public void setOutgoing(boolean outgoing) {
        isOutgoing = outgoing;
    }
}
