package comblackcoffer.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class BlackCofferData.
 *
 * @author GAURAV 2023-04-11 6:32:00 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlackCofferData {
	
	/** The id. */
	private long id;
	
	/** The end year. */
	private int endYear;
	
	/** The city lng. */
	private String cityLng;
	
	/** The city lat. */
	private String cityLat;
	
	/** The intensity. */
	private int intensity;
	
	/** The sector. */
	private String sector;
	
	/** The topic. */
	private String topic;
	
	/** The insight. */
	private String insight;
	
	/** The swot. */
	private String swot;
	
	/** The url. */
	private String url;
	
	/** The region. */
	private String region;
	
	/** The start year. */
	private int startYear;
	
	/** The impact. */
	private int impact;
	
	/** The added. */
	private Date added;
	
	/** The published. */
	private Date published;
	
	/** The city. */
	private String city;
	
	/** The country. */
	private String country;
	
	/** The relevance. */
	private int relevance;
	
	/** The pestle. */
	private String pestle;
	
	/** The source. */
	private String source;
	
	/** The title. */
	private String title;
	
	/** The likeli hood. */
	private int likeliHood;
}
