package ghost.domain.plan;

/**
 * 
 * @author toyan
 * PlanDO domain Object
 *
 */
public class PlanDO {
	
	private Integer planId;
	private String plan;
	
	public PlanDO(){
		
	}
	
	public PlanDO(String plan){
		this.plan = plan;
	}
	
	public PlanDO(Integer planId, String plan){
		this.planId = planId;
		this.plan = plan;
	}
	
	/**
	 * @return the planId
	 */
	public Integer getPlanId() {
		return planId;
	}
	/**
	 * @param planId the planId to set
	 */
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	/**
	 * @return the plan
	 */
	public String getPlan() {
		return plan;
	}
	/**
	 * @param plan the plan to set
	 */
	public void setPlan(String plan) {
		this.plan = plan;
	}
	


}
