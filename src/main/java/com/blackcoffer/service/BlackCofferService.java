package com.blackcoffer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackcoffer.dao.BlackCofferDAO;

import comblackcoffer.dto.BlackCofferData;
import comblackcoffer.dto.ChartFilteredResponseData;
import comblackcoffer.dto.FilterRequest;

@Service
public class BlackCofferService {
	@Autowired
	BlackCofferDAO blackCofferDAO;


	
	public List<BlackCofferData> getDefaultDashboard() {
		return blackCofferDAO.getDefaultDashboard();
	}
	
	public List<String> getMetaDataForSWOTFilter() {
		return blackCofferDAO.getMetaDataForSWOTFilter();
	}
	
	public List<String> getMetaDataForCountryFilter() {
		return blackCofferDAO.getMetaDataForCountryFilter();
	}
	
	public List<BlackCofferData> applyDataTableFilters(FilterRequest filters) {
		return blackCofferDAO.applyDataTableFilters(filters);
	}
	
	public List<ChartFilteredResponseData> applyChartFilters(FilterRequest filters) {
		return blackCofferDAO.applyChartFilters(filters);
	}
}
