package ZadacaJava1;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {

		//U programu omogućite dva broja, broj sati i minuta. Ispišite koliko taj broj sati i minuta iznosi u sekundama
		
		int hours = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj sati"));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj minuta"));
		
		System.out.println("Uneseno vrijeme u sekundama iznosi: " + ((hours * 60) + min)*60);
	}

}
