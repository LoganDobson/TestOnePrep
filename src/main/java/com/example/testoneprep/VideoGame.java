package com.example.testoneprep;

public class VideoGame {

    private String gameName;
    public double gamePrice;
    private String gameRating;




    public VideoGame(String gameName, double gamePrice, String gameRating) {
        setGameName(gameName);
        setGamePrice(gamePrice);
        setGameRating(gameRating);
    }

    public String toString(){
        return gameName + "price: " + gamePrice + " rating: " + gameRating;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName.toLowerCase();
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }

    public String getGameRating() {
        return gameRating;
    }

    public void setGameRating(String gameRating) {this.gameRating = gameRating;}
}
