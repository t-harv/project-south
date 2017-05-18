package ghost.domain.revise;

/**
 * 
 * @author toyan
 * 
 * ReviseDO domain object
 *
 */
public class ReviseDO {

	private Integer reviseId;
	private String revise;

	public ReviseDO(){

	}

	public ReviseDO(String revise){
		this.revise = revise;
	}

	public ReviseDO(Integer reviseId, String revise){
		this.reviseId = reviseId;
		this.revise = revise;
	}

	/**
	 * @return the reviseId
	 */
	public Integer getReviseId() {
		return reviseId;
	}
	/**
	 * @param reviseId the reviseId to set
	 */
	public void setReviseId(Integer reviseId) {
		this.reviseId = reviseId;
	}
	/**
	 * @return the revise
	 */
	public String getRevise() {
		return revise;
	}
	/**
	 * @param revise the revise to set
	 */
	public void setRevise(String revise) {
		this.revise = revise;
	}

}
