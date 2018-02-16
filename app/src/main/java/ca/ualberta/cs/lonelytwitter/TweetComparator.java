package ca.ualberta.cs.lonelytwitter;

import java.util.Comparator;

/**
 * Created by lepoidev on 2/15/18.
 *  * resources:
 *  - https://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property
 */



public class TweetComparator implements Comparator<Tweet> {
    @Override
    public int compare(Tweet tweet1, Tweet tweet2) {
        return tweet1.getDate().compareTo(tweet2.getDate());
    }
}