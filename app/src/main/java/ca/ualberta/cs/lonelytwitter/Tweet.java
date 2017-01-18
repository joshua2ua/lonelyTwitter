package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by pensk on 2017/01/17.
 */
public class Tweet {
    private Date date;
    private String message;

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
    }

    public Tweet(String message) throws TweetTooLongException {
        this.date = new Date();
        this.setMessage(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 144){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


