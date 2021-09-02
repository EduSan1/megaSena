package megasena;

import java.util.Random;
import java.util.Scanner;

public class Megasena {

	public static void main(String[] args) {

		int qn, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15;

		Scanner leitor = new Scanner(System.in);
		System.out.print("quantos números você deseja?(escolha números de 6 até 15)");
		qn = leitor.nextInt();
		leitor.close();
		Random com = new Random();
		n1 = com.nextInt(60) + 1;
		n2 = com.nextInt(60) + 1;
		n3 = com.nextInt(60) + 1;
		n4 = com.nextInt(60) + 1;
		n5 = com.nextInt(60) + 1;
		n6 = com.nextInt(60) + 1;
		n7 = com.nextInt(60) + 1;
		n8 = com.nextInt(60) + 1;
		n9 = com.nextInt(60) + 1;
		n10 = com.nextInt(60) + 1;
		n11 = com.nextInt(60) + 1;
		n12 = com.nextInt(60) + 1;
		n13 = com.nextInt(60) + 1;
		n14 = com.nextInt(60) + 1;
		n15 = com.nextInt(60) + 1;


		if (qn == 6) {
			System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " ");
			System.out.println(" ");
			System.out.println("Boa Sorte, vai precisar :)");

		} else if (qn == 7) {
			System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " ");
			System.out.println(n7);
			System.out.println("Boa Sorte, vai precisar :)");

		} else if (qn == 8) {
			System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " ");
			System.out.println(n7 + " " + n8);
			System.out.println("Boa Sorte, vai precisar :)");

		} else if (qn == 9) {
			System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " ");
			System.out.println(n7 + " " + n8 + " " + n9);
			System.out.println("Boa Sorte, vai precisar :)");

		} else if (qn == 10) {
			System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " ");
			System.out.println(n7 + " " + n8 + " " + n9 + " " + n10);
			System.out.println("Boa Sorte, vai precisar :)");

		} else if (qn == 11) {
			System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " ");
			System.out.println(n7 + " " + n8 + " " + n9 + " " + n10 + " " + n11);
			System.out.println("Boa Sorte, vai precisar :)");

		} else if (qn == 12) {
			System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " ");
			System.out.println(n7 + " " + n8 + " " + n9 + " " + n10 + " " + n11 + " " + n12);
			System.out.println("Boa Sorte, vai precisar :)");

		} else if (qn == 13) {
			System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " ");
			System.out.println(n7 + " " + n8 + " " + n9 + " " + n10 + " " + n11 + " " + n12 + " " + n13);
			System.out.println("Boa Sorte, vai precisar :)");

		} else if (qn == 14) {
			System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " ");
			System.out.println(n7 + " " + n8 + " " + n9 + " " + n10 + " " + n11 + " " + n12 + " " + n13 + " " + n14);
			System.out.println("Boa Sorte, vai precisar :)");

		} else if (qn == 15) {
			System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " ");
			System.out.println(n7 + " " + n8 + " " + n9 + " " + n10 + " " + n11 + " " + n12 + " " + n13 + " " + n14 + " " + n15);
			System.out.println("Boa Sorte, vai precisar :)");

		} else {

			System.out.println("insira um número de 6 até 15, por favor.");

		}

	}

}
