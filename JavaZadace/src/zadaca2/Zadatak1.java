package zadaca2;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {

		/*
		 * UÄ?itajte 2 broja za odreÄ‘ivanje intervala Ako je prvi veÄ‡i od drugog, napravi zamjenu 
		 * UÄ?itajte 3. broj i provjerite ulazi li taj broj u interval i ako ulazi koliko je udaljen od krajeva intervala 
		 * U protivnom ispiÅ¡ite da broj ne pripada unesenom intervalu
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
