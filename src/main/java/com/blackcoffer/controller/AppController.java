package com.blackcoffer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.blackcoffer.constant.AppConstant;
import com.blackcoffer.service.BlackCofferService;

import comblackcoffer.dto.BlackCofferData;
import comblackcoffer.dto.ChartFilteredResponseData;
import comblackcoffer.dto.FilterRequest;


/**
 * The Class AppController.
 *
 * @author GAURAV 2023-04-10 6:32:30 AM
 */
@Controller
@RequestMapping(value = "/app")
public class AppController {

	/** The course service. */
	@Autowired
	BlackCofferService blackCofferService;

	/**
	 * Index.
	 *
	 * @param request the request
	 * @return the model and view
	 */
	@GetMapping(value = "")
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView("dashboard");
		request.setAttribute("pageTitle", "Dashboard");
		return modelAndView;
	} 


	/**
	 * Gets the default dashboard.
	 *
	 * @param request the request
	 * @return the default dashboard
	 */
	@RequestMapping(value = "/getDefaultDashboard", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getDefaultDashboard(HttpServletRequest request) {
		Map<String, Object> response = new HashMap<>();
		try {
			List<BlackCofferData> data = blackCofferService.getDefaultDashboard();
			response.put(AppConstant.DATA, data);
			response.put(AppConstant.IS_SUCCESS, true);
			response.put(AppConstant.MESSAGE, "Default dashboard loaded successfully !");
			response.put(AppConstant.STATUS_CODE, HttpStatus.OK);
		} catch (Exception excp) {
			response.put(AppConstant.DATA, null);
			response.put(AppConstant.IS_SUCCESS, false);
			response.put(AppConstant.MESSAGE, "Something went wrong !");
			response.put(AppConstant.STATUS_CODE, HttpStatus.BAD_GATEWAY);
		}
		return response;
	}
	
	
	/**
	 * Apply data table filters.
	 *
	 * @param filters the filters
	 * @param request the request
	 * @return the map
	 */
	@RequestMapping(value = "/applyDataTableFilters", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> applyDataTableFilters(@RequestBody FilterRequest filters, HttpServletRequest request) {
		Map<String, Object> response = new HashMap<>();
		try {
			List<BlackCofferData> data = blackCofferService.applyDataTableFilters(filters);
			response.put(AppConstant.DATA, data);
			response.put(AppConstant.IS_SUCCESS, true);
			response.put(AppConstant.MESSAGE, "Datatable filter applied successfully !");
			response.put(AppConstant.STATUS_CODE, HttpStatus.OK);
		} catch (Exception excp) {
			response.put(AppConstant.DATA, null);
			response.put(AppConstant.IS_SUCCESS, false);
			response.put(AppConstant.MESSAGE, "Something went wrong !");
			response.put(AppConstant.STATUS_CODE, HttpStatus.BAD_GATEWAY);
		}
		return response;
	}
	
	/**
	 * Apply chart filters.
	 *
	 * @param filters the filters
	 * @param request the request
	 * @return the map
	 */
	@RequestMapping(value = "/applyChartFilters", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> applyChartFilters(@RequestBody FilterRequest filters, HttpServletRequest request) {
		Map<String, Object> response = new HashMap<>();
		try {
			List<ChartFilteredResponseData> data = blackCofferService.applyChartFilters(filters);
			response.put(AppConstant.DATA, data);
			response.put(AppConstant.IS_SUCCESS, true);
			response.put(AppConstant.MESSAGE, "Chart filter applied successfully !");
			response.put(AppConstant.STATUS_CODE, HttpStatus.OK);
		} catch (Exception excp) {
			response.put(AppConstant.DATA, null);
			response.put(AppConstant.IS_SUCCESS, false);
			response.put(AppConstant.MESSAGE, "Something went wrong !");
			response.put(AppConstant.STATUS_CODE, HttpStatus.BAD_GATEWAY);
		}
		return response;
	}
	
	
	/**
	 * Gets the meta data for SWOT filter.
	 *
	 * @param request the request
	 * @return the meta data for SWOT filter
	 */
	@RequestMapping(value = "/getMetaDataForSWOTFilter", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getMetaDataForSWOTFilter(HttpServletRequest request) {
		Map<String, Object> response = new HashMap<>();
		try {
			List<String> data = blackCofferService.getMetaDataForSWOTFilter();
			response.put(AppConstant.DATA, data);
			response.put(AppConstant.IS_SUCCESS, true);
			response.put(AppConstant.MESSAGE, "Meta data for SWOT loaded successfully !");
			response.put(AppConstant.STATUS_CODE, HttpStatus.OK);
		} catch (Exception excp) {
			response.put(AppConstant.DATA, null);
			response.put(AppConstant.IS_SUCCESS, false);
			response.put(AppConstant.MESSAGE, "Something went wrong !");
			response.put(AppConstant.STATUS_CODE, HttpStatus.BAD_GATEWAY);
		}
		return response;
	}
	
	
	/**
	 * Gets the meta data for country filter.
	 *
	 * @param request the request
	 * @return the meta data for country filter
	 */
	@RequestMapping(value = "/getMetaDataForCountryFilter", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getMetaDataForCountryFilter(HttpServletRequest request) {
		Map<String, Object> response = new HashMap<>();
		try {
			List<String> data = blackCofferService.getMetaDataForCountryFilter();
			response.put(AppConstant.DATA, data);
			response.put(AppConstant.IS_SUCCESS, true);
			response.put(AppConstant.MESSAGE, "Meta data for country loaded successfully !");
			response.put(AppConstant.STATUS_CODE, HttpStatus.OK);
		} catch (Exception excp) {
			response.put(AppConstant.DATA, null);
			response.put(AppConstant.IS_SUCCESS, false);
			response.put(AppConstant.MESSAGE, "Something went wrong !");
			response.put(AppConstant.STATUS_CODE, HttpStatus.BAD_GATEWAY);
		}
		return response;
	}
	
	
	

}
