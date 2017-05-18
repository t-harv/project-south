package ghost.domain.shape;

/**
 * 
 * @author toyan
 * ShapeDO domain object
 *
 */
public class ShapeDO {
	private Integer shapeId;
	private String shape;
	
	public ShapeDO(){}
	
	public ShapeDO(String shape){
		this.shape = shape;
	}
	
	public ShapeDO(Integer shapeId, String shape){
		this.shapeId = shapeId;
		this.shape = shape;
	}
	
	/**
	 * @return the shapeId
	 */
	public Integer getShapeId() {
		return shapeId;
	}
	/**
	 * @param shapeId the shapeId to set
	 */
	public void setShapeId(Integer shapeId) {
		this.shapeId = shapeId;
	}
	/**
	 * @return the shape
	 */
	public String getShape() {
		return shape;
	}
	/**
	 * @param shape the shape to set
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}

}
