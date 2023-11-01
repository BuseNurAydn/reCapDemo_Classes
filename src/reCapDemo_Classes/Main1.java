package reCapDemo_Classes;

public class Main1 {

	public static void main(String[] args) {
		Car1 servis = new Car1();
		servis.setColor("Beyaz");
		servis.setModel("Hyundai");
		servis.setEngine(1.8);
		servis.setDoors(3);

		System.out.println("Arabanýn rengi: " + servis.getColor());
		System.out.println("Arabanýn modeli: " + servis.getModel());
		System.out.println("Arabanýn motor hacmi: " + servis.getEngine());
		System.out.println("Arabanýn kapý sayýsý: " + servis.getDoors());
	}

}
