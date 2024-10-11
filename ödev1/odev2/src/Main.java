

import business.concretes.PlayerManager;
import business.concretes.GameSaleManager;
import core.concretes.EdevletVerificationManager;
import dataAccess.concretes.InMemoryPlayerDao;
import entities.Player;
import entities.Game;
import entities.Campaign;

public class Main {
    public static void main(String[] args) {
        // Player operations
        Player player = new Player("John", "Doe", "12345678901", 1990);
        PlayerManager playerManager = new PlayerManager(new InMemoryPlayerDao(), new EdevletVerificationManager());
        playerManager.register(player);
        
        // Game and campaign
        Game game = new Game("Cyberpunk", 59.99);
        Campaign campaign = new Campaign("Black Friday", 20);
        
        // Game sale
        GameSaleManager gameSaleManager = new GameSaleManager();
        gameSaleManager.sellGame(player, game, campaign);
    }
}
