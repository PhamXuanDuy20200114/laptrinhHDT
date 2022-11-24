

public class Cart {
	public static final int MAX_NUBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUBERS_ORDERED];
	int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc a) {
		if(qtyOrdered >= MAX_NUBERS_ORDERED) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered[qtyOrdered] = a ;
			qtyOrdered++;
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 0) {
			System.out.println("The cart is empty");
		}
		else {
			int index = -1;
			for(int i = 0; i < qtyOrdered; i++) {
				if(itemsOrdered[i].equals(disc)) {
					index = i;
				}
			}
			if(index != -1) {
				for(int i = index; i < qtyOrdered; i++) {
						itemsOrdered[i] = itemsOrdered[i+1];
				}
				System.out.println("The disc has been removed");
				qtyOrdered--;
			}
			else {
				System.out.println("Can not find the disc");
			}
		}
	}	

	public float totalCost() {
		float s = 0;
		for (int i = 0; i < qtyOrdered ; i++) {
			s += itemsOrdered[i].getCost();
		}
		return s;
	}
}
