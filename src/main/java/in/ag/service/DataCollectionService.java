package in.ag.service;

public interface DataCollectionService {
	
	public String createPlan(Integer caseNo);
	public String createIncome(Integer caseNo);
	public String createEducation(Integer caseNo);
	public String addKid(Integer caseNo);
	public String createKid(Integer caseNo);
	public String createCase(Integer appId);

}
