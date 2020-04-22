package atvGrupo;

import java.util.Scanner;

public class Ordenacao {

	public static void quickSort(int o[], int ladoEsquerdo, int ladoDireito) {
		int ladoE = ladoEsquerdo;
		int ladoD = ladoDireito;
		int pivo = o[(ladoE + ladoD) / 2];
		int troca;

		while (ladoE <= ladoD) {
			while (o[ladoE] < pivo) {
				ladoE = ladoE + 1;
			}
			while (o[ladoD] > pivo) {
				ladoD = ladoD - 1;
			}
			if (ladoE <= ladoD) {
				troca = o[ladoE];
				o[ladoE] = o[ladoD];
				o[ladoD] = troca;
				ladoE = ladoE + 1;
				ladoD = ladoD - 1;
			}
		}
		if (ladoD > ladoEsquerdo)
			quickSort(o, ladoEsquerdo, ladoD);

		if (ladoE < ladoDireito)
			quickSort(o, ladoE, ladoDireito);

	}

	public static void main(String args[]) {

	    Scanner in = new Scanner (System.in);
	    System.out.println("Digite os 5 valores do vetor sequencialmente e sem espaços");
	    int[] numeros = new int[5];
	    for(int i = 0; i < 5; i++){
	         System.out.print("Digite um número: ");
	         numeros[i] = in.nextInt();
	    }
	 
		for (int a = 0; a < numeros.length; a++) {
			System.out.println(" " + numeros[a]);
		}
		quickSort(numeros, 0, numeros.length - 1);
System.out.println("--------------Ordenado---------------");
		for (int a = 0; a < numeros.length; a++) {
			System.out.println(" " + numeros[a]);
		}

	}
}
