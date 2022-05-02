package core;

import java.io.File;

public class Message {

    //TODO: switch author to user class once created
    private String text;
    private final String author;
    private File[] attachments;

    public Message(String text, String author){
        this.text = text;
        this.author = author;
    }

    public Message(String text, String author, File[] attachments){
        this.text = text;
        this.author = author;
        this.attachments = attachments;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public File[] getAttachments() {
        return attachments;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAttachments(File[] attachments) {
        this.attachments = attachments;
    }
}
