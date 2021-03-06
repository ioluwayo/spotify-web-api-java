package data.follow;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.requests.data.follow.UnfollowArtistsOrUsersRequest;

import java.util.concurrent.Future;

public class UnfollowArtistsOrUsersExample {
  private static final String accessToken = "taHZ2SdB-bPA3FsK3D7ZN5npZS47cMy-IEySVEGttOhXmqaVAIo0ESvTCLjLBifhHOHOIuhFUKPW1WMDP7w6dj3MAZdWT8CLI2MkZaXbYLTeoDvXesf2eeiLYPBGdx8tIwQJKgV8XdnzH_DONk";
  private static final ModelObjectType type = ModelObjectType.ARTIST;
  private static final String[] ids = new String[]{"0LcJLqbBmaGUft1e9Mm8HV"};

  private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
          .setAccessToken(accessToken)
          .build();
  private static final UnfollowArtistsOrUsersRequest unfollowArtistsOrUsersRequest = spotifyApi
          .unfollowArtistsOrUsers(type, ids)
          .build();

  public static void unfollowArtistsOrUsers_Sync() {
    try {
      final String string = unfollowArtistsOrUsersRequest.execute();

      System.out.println("Empty String: " + string);
    } catch (Exception e) {
      System.out.println("Something went wrong!\n" + e.getMessage());
    }
  }

  public static void unfollowArtistsOrUsers_Async() {
    try {
      final Future<String> stringFuture = unfollowArtistsOrUsersRequest.executeAsync();

      // ...

      final String string = stringFuture.get();

      System.out.println("Empty String: " + string);
    } catch (Exception e) {
      System.out.println("Something went wrong!\n" + e.getMessage());
    }
  }
}