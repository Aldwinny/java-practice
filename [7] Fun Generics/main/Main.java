package main;

import cake.*;
import iceCream.*;
import java.util.Scanner;

public class Main {

	static Param<Cake> cake = new Param<Cake>(new Cake[2]);
	static Param<IceCream> iceCream = new Param<IceCream>(new IceCream[2]);
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Cake? 1,2,3");
		wrapper(scanner.nextInt(), true);
		System.out.println("Ice Cream? 1,2");
		wrapper(scanner.nextInt(), false);

		System.out.println(cake.get(0).flavor());
		System.out.println(iceCream.get(0).flavor());
	}

	public static void wrapper(int cakeNum, boolean choice) {
		if (choice) {
			switch (cakeNum) {
				case 1:
					cake.set(new AmpalayaCake(), 0);
					break;
				case 2:
					cake.set(new OrangeCake(), 0);
					break;
				case 3:
					cake.set(new StrawberryCake(), 0);
					break;
			}
		} else {
			switch (cakeNum) {
				case 1:
					iceCream.set(new mangoIceCream(), 0);
					break;
				case 2:
					iceCream.set(new StrawberryIceCream(), 0);
					break;
			}
		}
	}

}
