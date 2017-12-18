package Zadaca2;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {

		/*
		 * Učitajte 2 broja za određivanje intervala Ako je prvi veći od drugog, napravi zamjenu 
		 * Učitajte 3. broj i provjerite ulazi li taj broj u interval i ako ulazi koliko je udaljen od krajeva intervala 
		 * U protivnom ispišite da broj ne pripada unesenom intervalu
		 */
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));

		if (x > y) {
			int z = x;
			x = y;
			y = z;
		}
		System.out.println("Interval je: [" + x + "," + y + "]");
		if (broj >= x && broj <= y) {
			System.out.println("Broj " + broj + " je udaljen " + (broj - x - 1) + " mjesta od X-a i " + (y - broj - 1)
					+ " mjesta od Y-a");
		} else {
			System.out.println("Broj ne pripada unesenom intervalu");
		}

	}

}
