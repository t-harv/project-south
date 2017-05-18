package ghost.domain.edit;

/**
 * 
 * @author toyan
 * editDO domain object
 *
 */
public class EditDO {
	private Integer editId;
	private String edit;
	
	public EditDO(){}
	
	public EditDO(String edit){
		this.edit = edit;
	}
	
	public EditDO(Integer editId, String edit){
		this.editId = editId;
		this.edit = edit;
	}
	
	/**
	 * @return the editId
	 */
	public Integer getEditId() {
		return editId;
	}
	/**
	 * @param editId the editId to set
	 */
	public void setEditId(Integer editId) {
		this.editId = editId;
	}
	/**
	 * @return the edit
	 */
	public String getEdit() {
		return edit;
	}
	/**
	 * @param edit the edit to set
	 */
	public void setEdit(String edit) {
		this.edit = edit;
	}
	
	

}
