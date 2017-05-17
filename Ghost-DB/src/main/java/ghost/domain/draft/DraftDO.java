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
	
	public Integer getDraftId() {
		return draftId;
	}
	public void setDraftId(Integer draftId) {
		this.draftId = draftId;
	}
	public String getDraft() {
		return draft;
	}
	public void setDraft(String draft) {
		this.draft = draft;
	}
}
