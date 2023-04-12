package com.blackcoffer.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mysql.cj.util.StringUtils;

import comblackcoffer.dto.BlackCofferData;
import comblackcoffer.dto.ChartFilteredResponseData;
import comblackcoffer.dto.FilterRequest;

/**
 * The Class BlackCofferDAO.
 *
 * @author GAURAV 2023-04-11 9:32:30 AM
 */
@Repository
public class BlackCofferDAO {

	/** The named parameter jdbc template. */
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate; 

	/** The logger. */
	Logger logger = Logger.getLogger(BlackCofferDAO.class.getName());
	
	
	/**
	 * Gets the meta data for country filter.
	 *
	 * @return the meta data for country filter
	 */
	public List<String> getMetaDataForCountryFilter() {
		return namedParameterJdbcTemplate.query(
                "SELECT distinct(country) FROM data order by country",
                (rs, rowNum) ->
                rs.getString("country")
        );
	}
	
	/**
	 * Gets the meta data for SWOT filter.
	 *
	 * @return the meta data for SWOT filter
	 */
	public List<String> getMetaDataForSWOTFilter() {
		return namedParameterJdbcTemplate.query(
                "SELECT distinct(swot) FROM data order by swot",
                (rs, rowNum) ->
                rs.getString("swot")
        );
	}
	
	/**
	 * Apply chart filters.
	 *
	 * @param filters the filters
	 * @return the list
	 */
	public List<ChartFilteredResponseData> applyChartFilters (FilterRequest filters) {
		return namedParameterJdbcTemplate.query(
        		prepareChartFilterQuery(filters),
                (rs, rowNum) ->
                new ChartFilteredResponseData(
                		rs.getString("filteresParam"),
                		rs.getLong("count")
                )
        );
	}

	/**
	 * Prepare chart filter query.
	 *
	 * @param filters the filters
	 * @return the string
	 */
	private String prepareChartFilterQuery(FilterRequest filters) {
		StringBuffer sb = new StringBuffer("SELECT " + filters.getChartRepresentationField() + 
				" AS filteresParam, count("+ filters.getChartRepresentationField() +") AS count FROM DATA WHERE 1");
		
		if (!StringUtils.isNullOrEmpty(filters.getEndYear())) {
			sb.append(" AND end_year = '"+ filters.getEndYear() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getStartYear())) {
			sb.append(" AND start_year = '"+ filters.getStartYear() + "'");
		}
	
		if (!StringUtils.isNullOrEmpty(filters.getTopic())) {
			sb.append(" AND topic = '"+ filters.getTopic() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getSector())) {
			sb.append(" AND sector = '"+ filters.getSector() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getRegion())) {
			sb.append(" AND region = '"+ filters.getRegion() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getPestle())) {
			sb.append(" AND pestle = '"+ filters.getPestle() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getSource())) {
			sb.append(" AND source = '"+ filters.getSource() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getSwot())) {
			sb.append(" AND swot = '"+ filters.getSwot() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getCountry())) {
			sb.append(" AND country = '"+ filters.getCountry() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getCity())) {
			sb.append(" AND city = '"+ filters.getCity() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getCity())) {
			sb.append(" AND city = '"+ filters.getCity() + "'");
		}
		sb.append(" GROUP BY "+ filters.getChartRepresentationField());
		String query = sb.toString();
        logger.log(Level.INFO, query);
		return query;
	}

	/**
	 * Apply data table filters.
	 *
	 * @param filters the filters
	 * @return the list
	 */
	public List<BlackCofferData> applyDataTableFilters(FilterRequest filters) {
        return namedParameterJdbcTemplate.query(
        		prepareDataTableFilterQuery(filters),
                (rs, rowNum) ->
                new BlackCofferData(
                		rs.getInt("id"),
                		rs.getInt("end_year"),
                		rs.getString("cityLng"),
                		rs.getString("cityLat"),
                		rs.getInt("intensity"),
                		rs.getString("sector"),
                		rs.getString("topic"),
                		rs.getString("insight"),
                		rs.getString("swot"),
                		rs.getString("url"),
                		rs.getString("region"),
                		rs.getInt("start_year"),
                		rs.getInt("impact"),
                		rs.getDate("added"),
                		rs.getDate("published"),
                		rs.getString("city"),
                		rs.getString("country"),
                		rs.getInt("relevance"),
                		rs.getString("pestle"),
                		rs.getString("source"),
                		rs.getString("title"),
                		rs.getInt("likelihood")
                )
        );
	}
	
	/**
	 * Gets the default dashboard.
	 *
	 * @return the default dashboard
	 */
	public List<BlackCofferData> getDefaultDashboard() {
        return namedParameterJdbcTemplate.query(
                "select * from data",
                (rs, rowNum) ->
                new BlackCofferData(
                		rs.getInt("id"),
                		rs.getInt("end_year"),
                		rs.getString("cityLng"),
                		rs.getString("cityLat"),
                		rs.getInt("intensity"),
                		rs.getString("sector"),
                		rs.getString("topic"),
                		rs.getString("insight"),
                		rs.getString("swot"),
                		rs.getString("url"),
                		rs.getString("region"),
                		rs.getInt("start_year"),
                		rs.getInt("impact"),
                		rs.getDate("added"),
                		rs.getDate("published"),
                		rs.getString("city"),
                		rs.getString("country"),
                		rs.getInt("relevance"),
                		rs.getString("pestle"),
                		rs.getString("source"),
                		rs.getString("title"),
                		rs.getInt("likelihood")
                )
        );
	}

	/**
	 * Prepare data table filter query.
	 *
	 * @param filters the filters
	 * @return the string
	 */
	private String prepareDataTableFilterQuery(FilterRequest filters) {
		StringBuffer sb = new StringBuffer("SELECT * FROM DATA WHERE 1");
		
		if (!StringUtils.isNullOrEmpty(filters.getEndYear())) {
			sb.append(" AND end_year = '"+ filters.getEndYear() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getStartYear())) {
			sb.append(" AND start_year = '"+ filters.getStartYear() + "'");
		}
	
		if (!StringUtils.isNullOrEmpty(filters.getTopic())) {
			sb.append(" AND topic = '"+ filters.getTopic() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getSector())) {
			sb.append(" AND sector = '"+ filters.getSector() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getRegion())) {
			sb.append(" AND region = '"+ filters.getRegion() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getPestle())) {
			sb.append(" AND pestle = '"+ filters.getPestle() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getSource())) {
			sb.append(" AND source = '"+ filters.getSource() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getSwot())) {
			sb.append(" AND swot = '"+ filters.getSwot() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getCountry())) {
			sb.append(" AND country = '"+ filters.getCountry() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getCity())) {
			sb.append(" AND city = '"+ filters.getCity() + "'");
		}
		
		if (!StringUtils.isNullOrEmpty(filters.getCity())) {
			sb.append(" AND city = '"+ filters.getCity() + "'");
		}
		
		String query = sb.toString();
        logger.log(Level.INFO, query);
		return query;
	}
	
}
