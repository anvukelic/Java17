package zadaca1;

import javax.swing.JOptionPane;

public class Zadatak2 {

	public static void main(String[] args) {
		
		//U programu omgućite unos dvije stranice pravokutnika i izra�?unajte njegovu površinu i opseg
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite stranicu a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite stranicu b"));
		
		System.out.println("Opseg pravokutnika: " + 2*(a+b));
		System.out.println("Površina pravokutnika: " + a*b);
	}

}
