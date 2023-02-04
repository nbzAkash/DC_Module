package in.ag.binding;

import java.time.Year;

import lombok.Data;

@Data
public class CitizenCaseDtls {
	
	private Integer caseNo;
	private String planName;
	private String highestDegree;
	private Year graduationYear;
	private Double monthSal;
	private Double rentIncome;
	private Double propertyIncome;
	private String kidName;
	private Integer kidAge;
	private String kidSsn;
	private Integer createdBy;
	private Integer updatedBy;

}
