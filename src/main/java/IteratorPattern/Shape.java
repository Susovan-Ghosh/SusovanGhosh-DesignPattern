package IteratorPattern;

public class Shape {
	
	private String shapeName;
	private int shapeID;
	
	public Shape(String shapeName, int shapeID) {
		this.shapeName = shapeName;
		this.shapeID = shapeID;
	}

	public String getShapeName() {
		return shapeName;
	}

	public int getShapeID() {
		return shapeID;
	}	

}