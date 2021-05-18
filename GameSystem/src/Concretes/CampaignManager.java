package Concretes;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanya eklendi");
		System.out.println(campaign.getDiscountRate() + " Kampanya indirim");
		System.out.println(campaign.getStartDate() + " Kampanya ba�lang�� g�n� eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanya kald�r�ld�");
		System.out.println(campaign.getDiscountRate() + " Kampanya indirim oran� silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanya g�ncellendi");
		System.out.println(campaign.getDiscountRate() + " Kampanya indirim oran� g�cnellendi");
		
	}

}
