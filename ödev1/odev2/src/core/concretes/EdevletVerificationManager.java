package core.concretes;

import core.services.EdevletVerificationService;
import entities.Player;

public class EdevletVerificationManager implements EdevletVerificationService {

    @Override
    public boolean verify(Player player) {
        // Simule edilmiş doğrulama
        return player.getNationalId().length() == 11 && player.getBirthYear() < 2005;
    }
}
