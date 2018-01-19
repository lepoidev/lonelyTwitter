package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lepoidev on 1/18/18.
 */

public class notHappy extends Mood {

    public notHappy(Date date){
        super(date);
    }

    public notHappy(){
        super();
    }

    @Override
    public String isHappy() {
        return "~Happy";
    }
}
