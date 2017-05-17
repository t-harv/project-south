package ghost.domain.draft;

/**
 * 
 * @author toyan
 * 
 * DraftDO domain object.
 *
 */
public class DraftDO {
	private Integer draftId;
	private String draft;

	/**
	 * Default Constructor
	 */
	public DraftDO(){
	}

	/**
	 * pass only draft and not draft id
	 * @param draft
	 */
	public DraftDO(String draft){
		this.draft = draft;
	}
	
	/**
	 * pass all values into object
	 * @param draftId
	 * @param draft
	 */
	public DraftDO(Integer draftId, String draft){
		this.draftId = draftId;
		this.draft = draft;
	}
	
	/**
	 * @return the draftId
	 */
	public Integer getDraftId() {
		return draftId;
	}
	/**
	 * @param draftId the draftId to set
	 */
	public void setDraftId(Integer draftId) {
		this.draftId = draftId;
	}
	/**
	 * @return the draft
	 */
	public String getDraft() {
		return draft;
	}
	/**
	 * @param draft the draft to set
	 */
	public void setDraft(String draft) {
		this.draft = draft;
	}
	
	
}
