package edu.wctc.isp;

import java.time.LocalDate;

public interface CommonProduct extends Product {
    String getTitle();
    double getCost();
    String getFormattedReleaseDate();
    int getQuantityOnHand();
    LocalDate getReleaseDate();
    void order(int quantity);
}
