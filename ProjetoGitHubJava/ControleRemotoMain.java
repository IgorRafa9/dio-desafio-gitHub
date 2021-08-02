package Encapsulamento;

import java.util.Scanner;

public class Encapsulamento {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		ControleRemoto cr = new ControleRemoto();
		String resp;
		int canal;
		
		cr.ligar();
		cr.play();
		cr.abrirMenu();
		cr.aumentarVol();
	}
	
}
