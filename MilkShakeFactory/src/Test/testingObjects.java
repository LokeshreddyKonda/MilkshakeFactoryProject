package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Factory.Butter;
import Factory.Cheese;
import Factory.Curd;
import Factory.Milk;
import Factory.MilkShakeFactory;

class testingObjects {

	@Test
	void test() {
		MilkShakeFactory m = new MilkShakeFactory();
		assertTrue(m.createOrderedMilkShake("milk") instanceof Milk);
	}
	
	@Test
	void test1() {
		MilkShakeFactory m = new MilkShakeFactory();
		assertTrue(m.createOrderedMilkShake("cheese") instanceof Cheese);
	}
	
	@Test
	void test2() {
		MilkShakeFactory m = new MilkShakeFactory();
		assertTrue(m.createOrderedMilkShake("curd") instanceof Curd);
	}
	
	@Test
	void test3() {
		MilkShakeFactory m = new MilkShakeFactory();
		assertTrue(m.createOrderedMilkShake("butter") instanceof Butter);
	}
	
	@Test
	void test4() {
		MilkShakeFactory m = new MilkShakeFactory();
		assertFalse(m.createOrderedMilkShake("butter") instanceof Milk);
	}

}
