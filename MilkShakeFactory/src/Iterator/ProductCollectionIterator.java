package Iterator;

import Observer.DairyFarm;

public class ProductCollectionIterator implements Product{

	@Override
	public iterator getIterator() {
		return new DairyFarm();
	}

}
