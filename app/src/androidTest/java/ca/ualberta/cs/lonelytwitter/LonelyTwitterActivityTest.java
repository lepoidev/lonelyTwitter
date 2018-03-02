package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }
	
	public void testTweet(){
		solo.assertCurrentActivity("Wrong ACtivity", LonelyTwitterACtivity.class);
		
		solo.enterText((EditText) solo.getView(R.id.body), "TestTweet")
		
		solo.clickOnButton("Save");
		
		solo.clearEditText((EditText) solo.getView(R.id.body));
		
		assertTrue(solo.waitForText("TestTweet"));
		
		solo.clickOnButton("Clear");
		
		assertFalse(solo.waitForText("TestTweet", 1, 3000));
	}
	
	public void TestClickTweetList(){
		LonelyTwitterActivity activity = (LonelyTwitterActivity)solo.getCurrentActivity();
		solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
		
		solo.enterText((EditText) solo.getView(R.id.body), "TestTweet")
		
		solo.clickOnButton("Save");
		
		solo.clearEditText((EditText) solo.getView(R.id.body));
		
		assertTrue(solo.waitForText("TestTweet"));
		
		final ListView oldTweetList = activity.getOldTWeetList();
		
		Tweet tweet = (Tweet) oldTweetsList.getItemAtPosition(0);
		
		assertEquals("TestTweet", tweet.getMessage());
		
		solo.clickOnList(0);
		
		solo.assertCurrentActivity("Wrong Activity", EditTweetACtivity.class);
		
		assertEquals("TestTweet", solo.getView((TextView) solo.getView(R.id.textView)));
		
		solo.goBack();

		solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
	}
	
	@Override
	public void teatDown() throws exception {
		
	}
}