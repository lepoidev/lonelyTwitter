package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lepoidev on 1/18/18.
 */

public class NormalTweet extends Tweet {

    public NormalTweet(String message){
        super(message);
    }

    public NormalTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
