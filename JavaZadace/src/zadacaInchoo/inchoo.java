package zadacaInchoo;

import javax.swing.JOptionPane;

public class inchoo {

	public static void main(String[] args) {

		int brojRedaka = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka"));
		int brojStupaca = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));

		int i = brojRedaka-1;
		int j = brojStupaca-1;

		int uvlacenje = 0;
		int skretac = 1;
		int zavoj = 0;

		int smjer = 1;

		int matricaPuz[][] = new int[brojRedaka][brojStupaca];

		for (int x = 1; x <= brojRedaka * brojStupaca; x++) {
			switch(zavoj){
			case 1:
				i--; zavoj = 0;
				break;
			case 2:
				i++; zavoj = 0; uvlacenje++;
				break;
			case 3:
				j++; zavoj = 0;
				break;
			case 4:
				j--; zavoj = 0; 
				break;
			default:
				break;
			}
			matricaPuz[i][j] = x;
			if (skretac % 2 != 0) {
				if (smjer == 1) {
					if (j == uvlacenje) {
						skretac++;
						smjer=3;
						zavoj = 1;
						continue;
					} else {
						j--;
						continue;
					}
					
				}
				if (smjer == 2) {
					
					if (j == brojStupaca-1 - uvlacenje) {
						skretac++;
						smjer=4;
						zavoj = 2;
					} else {
						j++;
					}
				}
			} else {
				if (smjer == 3) {
					if (i == uvlacenje) {
						skretac++;
						smjer=2;
						zavoj = 3;
						continue;
					} else {
						i--;
						continue;
					}
				}
				if (smjer == 4) {
					if (i == brojRedaka-1 - uvlacenje) {
						skretac++;
						smjer=1;
						zavoj = 4;
					} else {
						i++;
					}					
				}
			}
		}
		for (i = 0; i < brojRedaka; i++) {
			for (j = 0; j < brojStupaca; j++) {
				System.out.printf("%2d ", matricaPuz[i][j]);
			}
			System.out.println();
		}

	}
}