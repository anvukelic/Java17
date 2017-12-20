package zadaca3;

import javax.swing.JOptionPane;

public class Zadatak4 {

	public static void main(String[] args) {
		int x[][] = new int[4][4];
		int y[][] = new int[4][4];
		int z[][] = new int[4][4];
		

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				x[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj za prvu matricu"));
				y[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj za drugu matricu"));
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(z[i][j] + " ");
			}
			System.out.println();
		}
	}
}