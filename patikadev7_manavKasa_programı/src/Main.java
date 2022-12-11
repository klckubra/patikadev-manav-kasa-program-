import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * Armut : 2,14 TL Elma : 3,67 TL Domates : 1,11 TL Muz: 0,95 TL Patlıcan : 5,00
		 * TL
		 */

		int armut, elma, domates, muz, patlican;
		double toplam = 0;

		System.out.print("Armut Kaç Kilo: ");
		armut = scan.nextInt();

		System.out.print("Elma Kaç Kilo: ");
		elma = scan.nextInt();

		System.out.print("Domates Kaç Kilo: ");
		domates = scan.nextInt();

		System.out.print("Muz kaç Kilo: ");
		muz = scan.nextInt();

		System.out.print("Patlıcan Kaç Kilo: ");
		patlican = scan.nextInt();

		toplam = armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.00;

		System.out.println("Toplam Tutar: " + toplam);
	}

}
