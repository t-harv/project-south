package ghost.domain.proofread;

/**
 * 
 * @author toyan
 * ProofRead domain object
 *
 */
public class ProofReadDO {
	private Integer proofReadId;
	private String proofRead;
	
	/**
	 * @return the proofReadId
	 */
	public Integer getProofReadId() {
		return proofReadId;
	}
	/**
	 * @param proofReadId the proofReadId to set
	 */
	public void setProofReadId(Integer proofReadId) {
		this.proofReadId = proofReadId;
	}
	/**
	 * @return the proofRead
	 */
	public String getProofRead() {
		return proofRead;
	}
	/**
	 * @param proofRead the proofRead to set
	 */
	public void setProofRead(String proofRead) {
		this.proofRead = proofRead;
	}

}
