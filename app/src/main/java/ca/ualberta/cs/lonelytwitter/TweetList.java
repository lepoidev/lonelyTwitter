package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by lepoidev on 2/15/18.
 *
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public Tweet getTweet(int index)
    {
        return tweets.get(index);
    }

    public void add(Tweet tweet)
    {
        if (this.hasTweet(tweet)) {
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
        }
    }

    public void delete(Tweet tweet)
    {
        tweets.remove(tweet);
    }

    public boolean hasTweet(Tweet tweet)
    {
        return tweets.contains(tweet);
    }

    public int getCount()
    {
        return tweets.size();
    }
    public ArrayList<Tweet> getTweets(int index)
    {
        Collections.sort(this.tweets, new TweetComparator());
        return this.tweets;
    }


}
