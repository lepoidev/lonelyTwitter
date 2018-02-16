package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by lepoidev on 2/15/18.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetListTest()
    {
        super(LonelyTwitterActivity.class);
    }




    public void testAddTweet()
    {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet()
    {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");

        assertFalse(tweets.hasTweet(tweet));

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet()
    {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet()
    {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("testing");

        tweets.add(tweet);

        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }
}
