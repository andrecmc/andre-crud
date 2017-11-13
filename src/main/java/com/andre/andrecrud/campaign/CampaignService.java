package com.andre.andrecrud.campaign;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampaignService {
	
	@Autowired
	CampaignRepository campaignRepository;
	
	public List<Campaign> getAllCampaigns() {
		List<Campaign> campaigns = new ArrayList<Campaign>();
		campaignRepository.findAll().forEach(campaigns::add);
		return campaigns;
	}
	
	public Campaign getCampaign(String id) {
		return campaignRepository.findOne(id);
	}
	
	public void addCampaign(Campaign campaign) {
		campaignRepository.save(campaign);
	}
	
	public void updateCampaign(String id, Campaign campaign) {
		campaign.setId(id);
		campaignRepository.save(campaign);
	}
	
	public void deleteCampaign(String id) {
		campaignRepository.delete(id);
	}

}
