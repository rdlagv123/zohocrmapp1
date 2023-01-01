package com.marketing.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.entities.Lead;
import com.marketing.services.LeadService;
import com.marketing.util.EmailService;

@Controller
public class LeadController {
	@Autowired
	private EmailService emailService;
	@Autowired
	private LeadService leadService;
	
@RequestMapping("/create")
public String viewCreateLeadForm() {
	return "Create_lead";
}
@RequestMapping("/saveLead")
public String saveLead(Lead lead,Model model) {
	model.addAttribute("msg","record is saved");
	//System.out.println(lead.getEmail());
	emailService.sendEmail(lead.getEmail(), "welcome", "test");
	leadService.saveLead(lead);
	return "Create_lead";
}
@RequestMapping("/listAll")
public String listLeads(Model model) {
	List<Lead> leads = leadService.getAllLeads();
	model.addAttribute("leads",leads);
	return "list_leads";
}
@RequestMapping("/deleteOne")
public String deleteOneLead(@RequestParam("id") long id, Model model) {
	leadService.deleteLead(id);
	List<Lead> leads = leadService.getAllLeads();
	model.addAttribute("leads",leads);
	return "list_leads";
}
@RequestMapping("/update")
public String updateOneLead(@RequestParam("id") long id,Model model) {
Lead lead = leadService.getleadbyId(id);
model.addAttribute("lead",lead);
return "update_lead";
}
@RequestMapping("/updateLead")
public String updateLead(Lead lead,Model model) {
	model.addAttribute("msg","record is updated");
	//System.out.println(lead.getEmail());
	leadService.saveLead(lead);
	List<Lead> leads = leadService.getAllLeads();
	model.addAttribute("leads",leads);
	
	return "list_lead";
}
}
