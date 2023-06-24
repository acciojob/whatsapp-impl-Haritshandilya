package com.driver;

import org.springframework.format.datetime.standard.DateTimeFormatterFactory;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.Date;

public class Message {

    private int id;
    private String content;
    private Date timestamp;

    public Message(int messageId, String content) {
        this.id = messageId;
        this.content = content;
        timestamp = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }


}
