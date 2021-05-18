package Concretes;

import Abstract.IUserService;
import Adapter.MernisServiceAdapter;
import Entities.User;

public class UserManager implements IUserService {

	

	public UserManager(MernisServiceAdapter mernisServiceAdapter) {
		
	}

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " Oyuncu adý eklendi");
		System.out.println(user.getLastName() + " Oyuncu soyadý eklendi");
		System.out.println(user.getId() + " Oyuncu ID eklendi");
	

	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " Oyuncu adý kaldrýrýldý");
		System.out.println(user.getLastName() + " Oyuncu soyadý kaldrýrýldý");
		System.out.println(user.getId() + " Oyuncu ID kaldrýrýldý");

	}

	@Override
	public void uptade(User user) {
		System.out.println(user.getFirstName() + " Oyuncu adý güncellendi");
		System.out.println(user.getLastName() + " Oyuncu soyadý güncellendi");
		System.out.println(user.getId() + " Oyuncu ID güncellendi");

	}

}
