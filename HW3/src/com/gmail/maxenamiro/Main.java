package com.gmail.maxenamiro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// знайти факторіал

		System.out.println("Введіть число від 4 до 15 щоб дізнатись його факторіал");
		Scanner sc = new Scanner(System.in);
		int factorial = sc.nextInt();
		long res = 1;

		if ((factorial > 4) && (factorial < 16)) {
			for (int i = 1; i <= factorial; i++) {
				res *= i;
			}

		}
		System.out.println("Factorial = " + res);

		System.out.println("---------------------------------");

		// таблиця множення на 5 у вигляді 1 х 5 = 5

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x 5 = " + 5 * i);
		}

		System.out.println("---------------------------------");
		// прямокутник з пустим всередині із *. Висота та ширина від користувача

		System.out.print("Введіть висоту прямокутника: ");
		int visota = sc.nextInt();
		System.out.print("Введіть ширину прямокутника: ");
		int shirina = sc.nextInt();

		for (int i = 0; i < visota; i++) {
			for (int j = 1; j < shirina; j++) {
				if ((i == 0) || (i == visota-1) || (j == 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("*");
		}
	}
}
