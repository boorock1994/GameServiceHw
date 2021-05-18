import Adapter.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager =new UserManager(new MernisServiceAdapter());
		
		userManager.add(new User(1, "Burak", "Öztaþ", "24800298092", 25031994));
		userManager.add(new User(2, "birisi", "öteki", "12345678", 20101990));
		userManager.add(new User(3, "diðeri", "beriki", "546789123", 25011992));
		
		GameManager gameManager =new GameManager();
		gameManager.add(new Game(1,"PUBG",120));
		gameManager.add(new Game(2,"GTA V",250));
		gameManager.add(new Game(3,"WATCH DOGS",110));
		gameManager.add(new Game(4,"AGE OF EMPÝRES 2",20));
	
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "DELÝSALI", 10, " 18-05-2021 ", " 20-05-2021 "));
		
		

	}

}
