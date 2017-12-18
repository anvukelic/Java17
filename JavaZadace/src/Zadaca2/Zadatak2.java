package Zadaca2;

import javax.swing.JOptionPane;

public class Zadatak2 {
	public static void main(String[] args) {

		/* 	
		 * Unesite neki broj koji predstavlja broj nekog dana u tjednu
		 * Ispišite naziv tog dana koji je zadan unesenim brojem 
		 * Ispišite koliko jedana ostalo do vikenda
		 */	
		int danUTjednu = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));

		switch (danUTjednu) {
		case 1:
			System.out.println("Ponedjeljak");
			break;
		case 2:
			System.out.println("Utorak");
			break;
		case 3:
			System.out.println("Srijeda");
			break;
		case 4:
			System.out.println("Četvrtak");
			break;
		case 5:
			System.out.println("Petak");
			break;
		case 6:
			System.out.println("Subota");
			break;
		case 7:
			System.out.println("Nedjelja");
			break;
		default:
			System.out.println("Tjedan ima 7 dana");
			break;
		}
		if (danUTjednu <= 5) {
			System.out.println("Broj dana do vikenda: "
					+ ((5 - danUTjednu) != 1 ? (6 - danUTjednu) + " dana" : (5 - danUTjednu) + " dan"));
		} else {
			System.out.println("Vikend je !");
		}
	}
}
