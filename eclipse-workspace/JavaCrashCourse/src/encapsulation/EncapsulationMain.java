package encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		// Encapsuation obj = new Encapsulation(); 
		// obj.doWork();
		Laptop l1 = new Laptop();
		l1.setPrice(23);
		System.out.println(l1.getPrice());
	}
	
	static class Laptop {
		public int getRam() {
			return ram;
		}

		public void setRam(int ram) {
			this.ram = ram;
		}

		public int getPrice() {
			return price;
		}

		int ram;
		private int price;
		
		public void setPrice(int price) {
			// is the user an Admin
			boolean isAdmin = true;
			if(!isAdmin) {
				System.out.println("you cannot set the price");
			}else {
				this.price = price;
			}
		}
	}
}
