package comblackcoffer.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlackCofferData {
	private long id;
	private int endYear;
	private String cityLng;
	private String cityLat;
	private int intensity;
	private String sector;
	private String topic;
	private String insight;
	private String swot;
	private String url;
	private String region;
	private int startYear;
	private int impact;
	private Date added;
	private Date published;
	private String city;
	private String country;
	private int relevance;
	private String pestle;
	private String source;
	private String title;
	private int likeliHood;
}
