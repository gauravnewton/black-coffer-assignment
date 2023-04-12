package comblackcoffer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class ChartFilteredResponseData.
 *
 * @author GAURAV 2023-04-11 5:32:00 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChartFilteredResponseData {
	
	/** The filter param. */
	private String filterParam;
	
	/** The count. */
	private long count;
}
