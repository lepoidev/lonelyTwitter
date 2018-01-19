package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lepoidev on 1/18/18.
 */

public class Happy extends Mood {

    public Happy(Date date){
        super(date);
    }

    public Happy(){
        super();
    }

    @Override
    public String isHappy() {
        return "Happy";
    }
}
