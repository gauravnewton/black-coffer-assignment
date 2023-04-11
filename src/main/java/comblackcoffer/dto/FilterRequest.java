package comblackcoffer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilterRequest {
	private String startYear;
	private String endYear;
	private String topic;
	private String sector;
	private String region;
	private String pestle;
	private String source;
	private String swot;
	private String country;
	private String city;
	private String dashboardType;
	private String chartType;
	private String chartRepresentationField;
}
