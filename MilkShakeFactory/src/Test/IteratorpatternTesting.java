package Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Iterator.ProductCollectionIterator;
import Observer.DairyFarm;

class IteratorpatternTesting {

	@Test
	void testIterator() {
		ProductCollectionIterator itr = new ProductCollectionIterator();
		assertTrue(itr.getIterator() instanceof DairyFarm);
	}
	
	@Test
	void testhasNext() {
		ProductCollectionIterator itr = new ProductCollectionIterator();
		assertFalse(itr.getIterator().hasNextproduct());
	}

}
