package WeekSix;

import java.util.Date;

public class GeometricObject {

	/* -color: String 
	 * -filled: boolean 
	 * -dateCreated: java.util.Date
	 * 
	 * 
	 * +GeometricObject()
	 * Creates a GeometricObject with the specified color and filled  values.
	 * +GeometricObject(color: String, filled: boolean) 
	 * +getColor(): String 
	 * +setColor(color: String): void 
	 * +isFilled(): boolean 
	 * +setFilled(filled: boolean): void 
	 * +getDateCreated(): java.util.Date 
	 * +toString(): String
	 * 
	 */

	private boolean filled;
	private Date dateCreated; 
	private String color;

	GeometricObject(){
		this.setFilled(false);
		this.dateCreated = new Date();
		this.setColor("");
	}
	
	GeometricObject(String color, boolean filled){
		this.setColor(color);
		this.setFilled(filled);
		this.dateCreated = new Date();
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		String description = "Color = " + this.color + " Filled = " + this.filled + " Date = " + this.dateCreated + " ";
		return description;
	}


}

