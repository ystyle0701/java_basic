package java_basic.trainning1;

public class ShowMultiplication {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<9; j++) {
				String str = String.format("%3d", i*j);
				System.out.print(str);
			}
			System.out.println();
		}
	}
}
