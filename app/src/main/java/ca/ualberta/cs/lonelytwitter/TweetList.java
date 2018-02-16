package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


/**
 * Created by lepoidev on 2/15/18.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public Tweet getTweet(int index)
    {
        return tweets.get(index);
    }

    public void add(Tweet tweet)
    {
        tweets.add(tweet);
    }

    public void delete(Tweet tweet)
    {
        tweets.remove(tweet);
    }

    public boolean hasTweet(Tweet tweet)
    {
        return tweets.contains(tweet);
    }
}
