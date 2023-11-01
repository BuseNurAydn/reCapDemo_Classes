package reCapDemo_Classes;

public class Car1 {
	private String color;
	private String model;
	private double engine ;
	private int doors;
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public double getEngine() {
		return engine;
		
	}
	public void setDoors(int doors) {
		if(doors == 2 || doors ==4) {
			this.doors = doors;
		}else {
			System.out.println("Kapý sayýsý 2 veya 4 olmalýdýr.");
		}
	}
	public int getDoors() {
		return doors;
	}

}
