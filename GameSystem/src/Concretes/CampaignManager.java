package Concretes;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanya eklendi");
		System.out.println(campaign.getDiscountRate() + " Kampanya indirim");
		System.out.println(campaign.getStartDate() + " Kampanya baþlangýç günü eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanya kaldýrýldý");
		System.out.println(campaign.getDiscountRate() + " Kampanya indirim oraný silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanya güncellendi");
		System.out.println(campaign.getDiscountRate() + " Kampanya indirim oraný gücnellendi");
		
	}

}
