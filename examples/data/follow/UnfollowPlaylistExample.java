package data.follow;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.requests.data.follow.UnfollowPlaylistRequest;

import java.util.concurrent.Future;

public class UnfollowPlaylistExample {
  private static final String accessToken = "taHZ2SdB-bPA3FsK3D7ZN5npZS47cMy-IEySVEGttOhXmqaVAIo0ESvTCLjLBifhHOHOIuhFUKPW1WMDP7w6dj3MAZdWT8CLI2MkZaXbYLTeoDvXesf2eeiLYPBGdx8tIwQJKgV8XdnzH_DONk";
  private static final String ownerId = "abbaspotify";
  private static final String playlistId = "3AGOiaoRXMSjswCLtuNqv5";

  private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
          .setAccessToken(accessToken)
          .build();
  private static final UnfollowPlaylistRequest unfollowPlaylistRequest = spotifyApi
          .unfollowPlaylist(ownerId, playlistId)
          .build();

  public static void unfollowPlaylist_Sync() {
    try {
      final String string = unfollowPlaylistRequest.execute();

      System.out.println("Empty String: " + string);
    } catch (Exception e) {
      System.out.println("Something went wrong!\n" + e.getMessage());
    }
  }

  public static void unfollowPlaylist_Async() {
    try {
      final Future<String> stringFuture = unfollowPlaylistRequest.executeAsync();

      // ...

      final String string = stringFuture.get();

      System.out.println("Empty String: " + string);
    } catch (Exception e) {
      System.out.println("Something went wrong!\n" + e.getMessage());
    }
  }
}