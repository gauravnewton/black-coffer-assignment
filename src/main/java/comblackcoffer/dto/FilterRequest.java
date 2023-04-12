package comblackcoffer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class FilterRequest.
 *
 * @author GAURAV 2023-04-11 9:32:00 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilterRequest {
	
	/** The start year. */
	private String startYear;
	
	/** The end year. */
	private String endYear;
	
	/** The topic. */
	private String topic;
	
	/** The sector. */
	private String sector;
	
	/** The region. */
	private String region;
	
	/** The pestle. */
	private String pestle;
	
	/** The source. */
	private String source;
	
	/** The swot. */
	private String swot;
	
	/** The country. */
	private String country;
	
	/** The city. */
	private String city;
	
	/** The dashboard type. */
	private String dashboardType;
	
	/** The chart type. */
	private String chartType;
	
	/** The chart representation field. */
	private String chartRepresentationField;
}
