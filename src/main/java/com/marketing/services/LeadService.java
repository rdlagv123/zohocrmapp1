package com.marketing.services;



import java.util.List;

import com.marketing.entities.Lead;




public interface LeadService {

public void saveLead(Lead lead);

public List<Lead> getAllLeads();

public void deleteLead(long id);

public Lead getleadbyId(long id);

}
