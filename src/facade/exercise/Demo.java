package facade.exercise;

public class Demo {
  public static void show() {
    var oauth = new OAuth();
    var requestToken = oauth.requestToken("appKey", "secret");
    var accessToken = oauth.getAccessToken(requestToken);

    var twitterClient = new TwitterClient();
    var tweets = twitterClient.getRecentTweets(accessToken);
  }

  public static void solution() {
    var service = new TwitterService();
    service.getRecentTweets();
  }
}
