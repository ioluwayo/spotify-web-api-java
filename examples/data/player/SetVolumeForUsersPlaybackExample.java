package data.player;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.requests.data.player.SetVolumeForUsersPlaybackRequest;

import java.util.concurrent.Future;

public class SetVolumeForUsersPlaybackExample {
  private static final String accessToken = "taHZ2SdB-bPA3FsK3D7ZN5npZS47cMy-IEySVEGttOhXmqaVAIo0ESvTCLjLBifhHOHOIuhFUKPW1WMDP7w6dj3MAZdWT8CLI2MkZaXbYLTeoDvXesf2eeiLYPBGdx8tIwQJKgV8XdnzH_DONk";
  private static final int volumePercent = 100;

  private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
          .setAccessToken(accessToken)
          .build();
  private static final SetVolumeForUsersPlaybackRequest setVolumeForUsersPlaybackRequest = spotifyApi
          .setVolumeForUsersPlayback(volumePercent)
          .device_id("5fbb3ba6aa454b5534c4ba43a8c7e8e45a63ad0e")
          .build();

  public static void setVolumeForUsersPlayback_Sync() {
    try {
      final String string = setVolumeForUsersPlaybackRequest.execute();

      System.out.println("Empty String: " + string);
    } catch (Exception e) {
      System.out.println("Something went wrong!\n" + e.getMessage());
    }
  }

  public static void setVolumeForUsersPlayback_Async() {
    try {
      final Future<String> stringFuture = setVolumeForUsersPlaybackRequest.executeAsync();

      // ...

      final String string = stringFuture.get();

      System.out.println("Empty String: " + string);
    } catch (Exception e) {
      System.out.println("Something went wrong!\n" + e.getMessage());
    }
  }
}