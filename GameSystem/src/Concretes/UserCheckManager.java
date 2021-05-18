package Concretes;

import Abstract.IUserCheckService;
import Entities.User;

public class UserCheckManager implements IUserCheckService {

	@Override
	public boolean isUserReal(User user) {
		
		return true;
	}

}
