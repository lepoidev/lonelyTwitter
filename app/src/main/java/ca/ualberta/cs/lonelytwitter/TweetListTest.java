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

    public void testGetTweets()
    {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");

        tweets.add(tweet);

        Tweet tweet2 = new NormalTweet("adding a normal Tweet");

        tweets.add(tweet2);

        for(int i = 0; i < tweets.getCount() - 1; i++){
            //assertTrue(tweets.get(i).getDate() <= tweets.get(i+1).getDate());
            assertEquals(tweets.getTweet(i+1).getDate().compareTo(tweets.getTweet(i).getDate()), 1);
        }
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        //Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);

        assertEquals(tweets.getCount(), 1);
    }
}
