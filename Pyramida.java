public class pyramida {
	public static void main(String[] args) {
		int vyska = Integer.parseInt(args[0]);
		int mezera = vyska - 1;
			
		for (int y = 0; y < vyska; y++) {
			for(int a = mezera; a >=0; a--) {
			System.out.print(" ");
			}
			for (int x = 0; x < y * 2 + 1; x++) {
				System.out.printf("X");
			}
		
			mezera--;
			System.out.println();
		}
	}
}
