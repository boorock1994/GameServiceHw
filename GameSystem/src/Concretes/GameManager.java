package Concretes;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " Oyun eklendi");
		System.out.println(game.getGamePrice() + " Oyun �creti eklendi");
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println(game.getGameName() + " Oyun kald�r�ld�");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " Oyun g�ncellendi");
		System.out.println(game.getGamePrice() + " Oyun �creti g�ncellendi");
	}

}
