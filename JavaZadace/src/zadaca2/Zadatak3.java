package zadaca2;

import javax.swing.JOptionPane;

public class Zadatak3 {
	public static void main(String[] args) {

		/*
		 * Unijeti godinu Unijeti broj te za isti slovno ispisati broj dana koliko ima u
		 * tom mjesecu Inaće ispisati "U godini ima 12 mjeseci"
		 */

		int godina = Integer.parseInt(JOptionPane.showInputDialog("Unesite godinu"));
		int mjesec = Integer.parseInt(JOptionPane.showInputDialog("Unesite mjesec"));

		switch (mjesec) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Mjesec ima 31 dan");
			break;
		case 2:
			if (godina % 4 == 0) {
				System.out.println("Mjesec ima 29 dana");
			} else {
				System.out.println("Mjesec ima 28 dana");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Mjesec ima 30 dana");
			break;
		default:
			System.out.println("Godina ima 12 mjeseci");
		}

	}
}
