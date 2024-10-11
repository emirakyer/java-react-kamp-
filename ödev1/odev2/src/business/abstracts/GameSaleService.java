package business.abstracts;

import entities.Player;
import entities.Game;
import entities.Campaign;

public interface GameSaleService {
    void sellGame(Player player, Game game, Campaign campaign);
}
