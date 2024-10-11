package dataAccess.abstracts;
import entities.Player;

public interface PlayerDao {
    void add(Player player);
    void update(Player player);
    void delete(Player player);
} 
