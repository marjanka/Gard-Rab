public class Gardener {

	int waterPlants(int n) {
		int sum = 0;
		if (n > 0 && n <= 1000) {
			int an = 2+2*(n-1);
			sum = (2+an)/2*n+1;
			return sum;
		}
		if (n == 0) {
			return 1;
		} else {
			System.out.println("Incorrect input!");
			return -1;
		}
	}

	public static void main(String[] args) {
		int stage = 500;
		Gardener teen = new Gardener();
		System.out.println(stage + "         " + teen.waterPlants(stage));

	}

}
