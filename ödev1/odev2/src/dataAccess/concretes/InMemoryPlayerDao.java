package dataAccess.concretes;

import dataAccess.abstracts.PlayerDao;
import entities.Player;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPlayerDao implements PlayerDao {
    List<Player> players = new ArrayList<>();

    @Override
    public void add(Player player) {
        players.add(player);
        System.out.println(player.getFirstName() + " added to system.");
    }

    @Override
    public void update(Player player) {
        System.out.println(player.getFirstName() + " updated.");
    }

    @Override
    public void delete(Player player) {
        players.remove(player);
        System.out.println(player.getFirstName() + " deleted from system.");
    }
}
