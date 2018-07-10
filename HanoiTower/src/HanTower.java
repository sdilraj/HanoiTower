
public class HanTower {
	private static Hanoi[] hano;
	public  static void hanTower(int n) {
		
		hano = new Hanoi[4]; // creating three stacks
		
		for (int i = 0; i <= 3; i++) {
			hano[i] = new Hanoi(4);
		}
		
		for (int j = n; j > 0; j--) {
			hano[1].push(new Integer(j));
		}
		showtower(n, 1, 2, 3);
	}
	
	
	public static void showtower (int n, int x, int y, int z) {
		if (n > 0) {
			try {
				showtower ( n - 1, x, z, y);
				
				Integer j = (Integer) hano[x].pop(); //moving j to top of tower x
				hano[y].push(j);
				System.out.println(" Move disk " + j + " from tower " 
				+ x + " to top of tower " + y);
			
				showtower(n - 1, z, y, x);
			} catch(Exception e){}
		}
	}
	
	public static void main (String[] args) {
		System.out.println("Running Hanoi Tower: ");
		hanTower(3);
	}
	

}
