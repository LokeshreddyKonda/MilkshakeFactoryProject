package Factory;

public class Curd extends MilkProduct{

	private String Quality;
	private String Quantity;
	private String CreamContent;
	
	public Curd(String Quality, String Quantity, String CreamContent) {
		super(Quality, Quantity, CreamContent);
		this.Quality = Quality;
		this.Quantity = Quantity;
		this.CreamContent = CreamContent;
	}



	@Override
	public Object createOrderedMilkShake() {
		return new Curd("good","1Kg","10%");
	}



	@Override
	public String toString() {
		return "Curd [Quality=" + Quality + ", Quantity=" + Quantity + ", CreamContent=" + CreamContent + "]";
	}

	
}
