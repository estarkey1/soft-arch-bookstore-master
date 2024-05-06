package edu.wctc.isp;

import java.time.Duration;

public interface MusicProduct extends Product {
    String getArtist();

    String getAuthor();

    int getPages();

    Duration getPlayingTime();
}