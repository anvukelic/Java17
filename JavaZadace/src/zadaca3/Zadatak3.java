package zadaca3;

import javax.swing.JOptionPane;

public class Zadatak3 {

	public static void main(String[] args) {
		int x, y;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
		
		if(x>y) {
			int z = x;
			x = y;
			y=z;
		}
		
		for(int i = x; i <= y; i++) {
			if((i != 2) && (i != 3) && (i != 5) && (i != 7)) {
				if((i%2!=0) && (i%3!=0) && (i%5!=0) && (i%7!=0)) {
					System.out.println(i);
				}
			} else {
				System.out.println(i);
			}
			
		}
	}
}
