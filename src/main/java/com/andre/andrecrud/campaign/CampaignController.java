package com.andre.andrecrud.campaign;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampaignController {
	
	@Autowired
	CampaignService campaignService;
	final Logger logger = LoggerFactory.getLogger(CampaignController.class);

	@RequestMapping("/campaigns")
	public List<Campaign> getAllCampaigns() {
		logger.debug("I am in getAllCampaigns");
		return campaignService.getAllCampaigns();
	}
	
	@RequestMapping("/campaigns/{id}")
	public Campaign getCampaigns(@PathVariable String id) {
		return campaignService.getCampaign(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/campaigns")
	public void addCampaign(@RequestBody Campaign topic) {
		campaignService.addCampaign(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value ="/campaigns/{id}")
	public void updateCampaign(@RequestBody Campaign campaign, @PathVariable String id) {
		logger.debug("I am in updateCampaign");
		campaignService.updateCampaign(id, campaign);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value ="/campaigns/{id}")
	public void deleteCampaign(@PathVariable String id) {
		campaignService.deleteCampaign(id);
	}

}
