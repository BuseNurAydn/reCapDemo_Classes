package reCapDemo_Classes;

public class Main1 {

	public static void main(String[] args) {
		Car1 servis = new Car1();
		servis.setColor("Beyaz");
		servis.setModel("Hyundai");
		servis.setEngine(1.8);
		servis.setDoors(3);

		System.out.println("Araban�n rengi: " + servis.getColor());
		System.out.println("Araban�n modeli: " + servis.getModel());
		System.out.println("Araban�n motor hacmi: " + servis.getEngine());
		System.out.println("Araban�n kap� say�s�: " + servis.getDoors());
	}

}
