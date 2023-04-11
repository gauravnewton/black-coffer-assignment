package comblackcoffer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChartFilteredResponseData {
	private String filterParam;
	private long count;
}
