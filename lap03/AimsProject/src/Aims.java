
public class Aims {
	public static void main(String[] args) {
		// create a new cart
		Cart anOrder = new Cart();
		// create a new DVD and add them on the card
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladins", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
        // remove dvd2
		anOrder.removeDigitalVideoDisc(dvd2);
	
		
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
		
	}
}
