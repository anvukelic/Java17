package zadaca3;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int zbroj = 0, min = 0, max = 0;
		for (int i = 0; i < 5; i++) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
			if (i == 0) {
				min = x;
				max = x;
			}
			if(x > max) {
				max = x;
			}
			if(x < min) {
				min = x;
			}
			zbroj += x;
		}
		
		System.out.println("Najmanji element u nizu je: " + min);
		System.out.println("Najveci element u nizu je: " + max);
		System.out.println("Zbroj elementa u nizu je: " + zbroj);

	}
}
