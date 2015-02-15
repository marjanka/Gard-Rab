public class Rabbits {

	int numberOfRabbits(int n, int k) {
		if (n == 0)
			return 1;
		if (n > 1 && n <= 100 && k >= 0 && k <= 10000) {
			int rabbits = 1;
			for (int i = 1; i <= n; i++) {
				if (rabbits > k) {
					rabbits -= k;	
				} 
				rabbits*= 2;
			}
			
			return rabbits;
		} else {
			System.out.println("Incorect input.");
			return -1;
		}

	}

	public static void main(String[] args) {

		int numOfMonth = 70;
		int numOfRabbits = 3000;

		Rabbits reb = new Rabbits();
int num=reb.numberOfRabbits(numOfMonth, numOfRabbits);
		System.out.print(numOfMonth + "   " + numOfRabbits
				+ "                    "
				+ num);
	}

}
