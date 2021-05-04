package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameService {
	void sellGame(Gamer gamer, Game game,Campaign campaign);
	void sellGame(Gamer gamer, Game game);
}
