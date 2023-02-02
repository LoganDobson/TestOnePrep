package com.example.testoneprep;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
    private ArrayList<VideoGame> cart;

    public ShoppingCart(){
        cart = new ArrayList<>();

    }

    public void addVideoGame(VideoGame videoGame){

        cart.add(videoGame);

    }

    public double getTotalPrice(){
        double total = 0;
        for (int i = 0; i< cart.size();i++)
            total = total + cart.get(i).getGamePrice();
        return total;
    }

    public String getAllNames(){
        String name = "";
        for(int j = 0; j< cart.size(); j++)
            name = name + cart.get(j).getGameName();
        return name;
    }

    public String getGameRatings(){
        String ratings = "";
        for(int k = 0; k< cart.size();k++)
            ratings = ratings + cart.get(k).getGameRating();
        return ratings;
    }


}
