package Factory;



public class MilkShakeFactory {

	public Object createOrderedMilkShake(String order){
		if("milk".equals(order)) {
			Milk m = new Milk("good","3L","15%");
			return m;
		}else if("cheese".equals(order)) {
			 Cheese c = new Cheese("good", "5L", "10%");
			 return c;
		}else if("curd".equals(order)) {
			Curd c = new Curd("good", "5L", "10%");
			 return c;
		}else if("butter".equals(order)) {
			Butter b = new Butter("good","5L","10%");
			return b;
		}
		return null;
	}
}
