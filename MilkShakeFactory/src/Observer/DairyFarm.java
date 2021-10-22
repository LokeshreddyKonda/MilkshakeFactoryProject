package Observer;

import java.util.ArrayList;
import java.util.List;

import Factory.Butter;
import Factory.Cheese;
import Factory.Curd;
import Factory.Milk;
import Iterator.iterator;

public class DairyFarm implements iterator{
	
	public static List<Object> cart = new ArrayList<>();
	
	public static void removeFromCart() {
	
	}

	public static void countCart() {
		notifyTotalCost();
	}

	private static void notifyTotalCost() {
		System.out.println("No of products in Cart :"+cart.size());
	}

	int i;
	@Override
	public boolean hasNextproduct() {
		if(i < this.cart.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object nextProduct() {
		if(this.hasNextproduct()) {
			return this.cart.get(i++);
		}
		return null;
	}

	public static void addToCart(Milk milk) {
		cart.add(milk);
	}
	public static void addToCart(Curd curd) {
		cart.add(curd);
	}

	public static void addToCart(Cheese cheese) {
		cart.add(cheese);
	}

	public static void addToCart(Butter butter) {
		cart.add(butter);
	}
}
