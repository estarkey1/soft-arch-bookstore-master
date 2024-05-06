package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface Book extends Product {
    String getArtist();

    String getAuthor();
    int getPages();

    Duration getPlayingTime();
}