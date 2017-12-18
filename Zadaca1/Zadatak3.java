package ZadacaJava1;

import javax.swing.JOptionPane;

public class Zadatak3 {

	public static void main(String[] args) {
		// U programu omogućite unos broja sekundi i ispišite odgovarajuće vrijeme u satima, minutama i sekundama
		
		int sec = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj sekundi"));
		
		int hours = sec/3600;
		int mins = (sec/60)%60;
		sec %= 60;
		
		System.out.printf("Vrijeme je %02d:%02d:%02d", hours, mins, sec);
		

	} 

}
