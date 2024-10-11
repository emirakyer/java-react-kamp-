package business.concretes;

import business.abstracts.GameSaleService;
import entities.Player;
import entities.Game;
import entities.Campaign;

public class GameSaleManager implements GameSaleService {

    @Override
    public void sellGame(Player player, Game game, Campaign campaign) {
        double discountedPrice = game.getPrice() - (game.getPrice() * campaign.getDiscountPercentage() / 100);
        System.out.println(player.getFirstName() + " bought " + game.getGameName() + " for " + discountedPrice + " using " + campaign.getCampaignName() + " campaign.");
    }
}
