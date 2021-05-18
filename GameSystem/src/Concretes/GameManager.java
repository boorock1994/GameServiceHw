package Concretes;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " Oyun eklendi");
		System.out.println(game.getGamePrice() + " Oyun ücreti eklendi");
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println(game.getGameName() + " Oyun kaldýrýldý");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " Oyun güncellendi");
		System.out.println(game.getGamePrice() + " Oyun ücreti güncellendi");
	}

}
