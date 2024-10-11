package business.concretes;

import business.abstracts.PlayerService;
import core.services.EdevletVerificationService;
import dataAccess.abstracts.PlayerDao;
import entities.Player;

public class PlayerManager implements PlayerService {

    private PlayerDao playerDao;
    private EdevletVerificationService verificationService;

    public PlayerManager(PlayerDao playerDao, EdevletVerificationService verificationService) {
        this.playerDao = playerDao;
        this.verificationService = verificationService;
    }

    @Override
    public void register(Player player) {
        if (verificationService.verify(player)) {
            playerDao.add(player);
        } else {
            System.out.println("Verification failed for " + player.getFirstName());
        }
    }

    @Override
    public void update(Player player) {
        playerDao.update(player);
    }

    @Override
    public void delete(Player player) {
        playerDao.delete(player);
    }
}
