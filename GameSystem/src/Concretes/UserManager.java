package Concretes;

import Abstract.IUserService;
import Adapter.MernisServiceAdapter;
import Entities.User;

public class UserManager implements IUserService {

	

	public UserManager(MernisServiceAdapter mernisServiceAdapter) {
		
	}

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " Oyuncu ad� eklendi");
		System.out.println(user.getLastName() + " Oyuncu soyad� eklendi");
		System.out.println(user.getId() + " Oyuncu ID eklendi");
	

	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " Oyuncu ad� kaldr�r�ld�");
		System.out.println(user.getLastName() + " Oyuncu soyad� kaldr�r�ld�");
		System.out.println(user.getId() + " Oyuncu ID kaldr�r�ld�");

	}

	@Override
	public void uptade(User user) {
		System.out.println(user.getFirstName() + " Oyuncu ad� g�ncellendi");
		System.out.println(user.getLastName() + " Oyuncu soyad� g�ncellendi");
		System.out.println(user.getId() + " Oyuncu ID g�ncellendi");

	}

}
