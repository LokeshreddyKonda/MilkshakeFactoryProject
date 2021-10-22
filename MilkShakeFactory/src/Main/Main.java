package Main;

import java.util.Scanner;

import Command.BuyProductsInCart;
import Command.Logout;
import Command.Manager;
import Factory.Butter;
import Factory.Cheese;
import Factory.Curd;
import Factory.Milk;
import Factory.MilkShakeFactory;
import Iterator.ProductCollectionIterator;
import Observer.DairyFarm;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("MilkShakeFactory");
		System.out.println("User Credentials (user , pass)");
		System.out.println("Enter UserName :");
		String user = scanner.next();
		System.out.println("Enter Password :");
		String pass = scanner.next();
		if("user".equalsIgnoreCase(user) && "pass".equalsIgnoreCase(pass)) {
			System.out.println("Login Success");
			do {
				System.out.println("Order Your Milk Products");
				System.out.println("1. Milk");
				System.out.println("2. Curd");
				System.out.println("3. Cheese");
				System.out.println("4. Butter");
				System.out.println("5. Count Products in cart");
				System.out.println("6. Products in Cart");
				System.out.println("7. Buy Products in Cart");
				System.out.println("8. Logout");
				switch(scanner.next()) {
				case "1":Milk milk =(Milk) new MilkShakeFactory().createOrderedMilkShake("milk");
						DairyFarm.addToCart(milk);
					break;
				case "2":Curd curd =(Curd) new MilkShakeFactory().createOrderedMilkShake("curd");
						DairyFarm.addToCart(curd);
					break;
				case "3":Cheese cheese =(Cheese) new MilkShakeFactory().createOrderedMilkShake("cheese");
						DairyFarm.addToCart(cheese);
					break;
				case "4":Butter butter =(Butter) new MilkShakeFactory().createOrderedMilkShake("butter");
						DairyFarm.addToCart(butter);
					break;
				case "5":DairyFarm.countCart();
					break;
				case "6":DairyFarm itr = (DairyFarm) new ProductCollectionIterator().getIterator();
					while(itr.hasNextproduct()) {
						Object nextProduct = itr.nextProduct();
						System.out.println(nextProduct.toString());
					}
					break;
				case "7":Manager.command(new BuyProductsInCart(), "1");
					break;
				case "8":Manager.command(new Logout(), "2");
				System.exit(0);
				}
				System.out.println("Do u want to continue to Order More(y / n)");
			}while("y".equalsIgnoreCase(scanner.next()));
			
		}else {
			System.out.println("Invalid Credentials");
		}
	}
}
