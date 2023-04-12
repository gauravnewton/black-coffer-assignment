package com.blackcoffer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackcoffer.dao.BlackCofferDAO;

import comblackcoffer.dto.BlackCofferData;
import comblackcoffer.dto.ChartFilteredResponseData;
import comblackcoffer.dto.FilterRequest;

/**
 * The Class BlackCofferService.
 *
 * @author GAURAV 2023-04-11 6:32:30 PM
 */
@Service
public class BlackCofferService {
	
	/** The black coffer DAO. */
	@Autowired
	BlackCofferDAO blackCofferDAO;


	
	/**
	 * Gets the default dashboard.
	 *
	 * @return the default dashboard
	 */
	public List<BlackCofferData> getDefaultDashboard() {
		return blackCofferDAO.getDefaultDashboard();
	}
	
	/**
	 * Gets the meta data for SWOT filter.
	 *
	 * @return the meta data for SWOT filter
	 */
	public List<String> getMetaDataForSWOTFilter() {
		return blackCofferDAO.getMetaDataForSWOTFilter();
	}
	
	/**
	 * Gets the meta data for country filter.
	 *
	 * @return the meta data for country filter
	 */
	public List<String> getMetaDataForCountryFilter() {
		return blackCofferDAO.getMetaDataForCountryFilter();
	}
	
	/**
	 * Apply data table filters.
	 *
	 * @param filters the filters
	 * @return the list
	 */
	public List<BlackCofferData> applyDataTableFilters(FilterRequest filters) {
		return blackCofferDAO.applyDataTableFilters(filters);
	}
	
	/**
	 * Apply chart filters.
	 *
	 * @param filters the filters
	 * @return the list
	 */
	public List<ChartFilteredResponseData> applyChartFilters(FilterRequest filters) {
		return blackCofferDAO.applyChartFilters(filters);
	}
}
