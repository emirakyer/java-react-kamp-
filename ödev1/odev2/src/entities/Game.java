package entities;

public class Game {
    private String gameName;
    private double price;

    public Game(String gameName, double price) {
        this.gameName = gameName;
        this.price = price;
    }

    // Getters and Setters
    public String getGameName() { return gameName; }
    public void setGameName(String gameName) { this.gameName = gameName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
