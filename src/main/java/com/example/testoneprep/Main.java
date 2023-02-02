package com.example.testoneprep;

public class Main {

    public static void main(String[] args) {
        VideoGame videoGame = new VideoGame("Call of Duty ", 79.99, " 4.5 ");
        VideoGame videoGame2 = new VideoGame("Overwatch ", 79.99, " 4.7 ");
        VideoGame videoGame3 = new VideoGame("Fifa ", 79.99, " 3.5 ");
        VideoGame videoGame4 = new VideoGame("Battlefield ", 79.99, " 2.5 ");
        VideoGame videoGame5 = new VideoGame("Grand Theft Auto ", 79.99, " 5.0 ");

        ShoppingCart cart = new ShoppingCart();
        cart.addVideoGame(videoGame2);
        cart.addVideoGame(videoGame3);
        cart.addVideoGame(videoGame4);
        System.out.printf("the total price of the cart is $%.2f", cart.getTotalPrice());
        System.out.printf("\nall the names of the games are " + cart.getAllNames());
        System.out.printf("\nthe respective ratings in order of names listed are " + cart.getGameRatings());
    }
}
