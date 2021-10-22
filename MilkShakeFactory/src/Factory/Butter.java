package Factory;

public class Butter extends MilkProduct{

	private String Quality;
	private String Quantity;
	private String CreamContent;
	
	
	public Butter(String Quality, String Quantity, String CreamContent) {
		super(Quality, Quantity, CreamContent);
		this.Quality = Quality;
		this.Quantity = Quantity;
		this.CreamContent = CreamContent;
	}



	@Override
	public Object createOrderedMilkShake() {
		return new Butter("good","5Kg","10%");
	}



	@Override
	public String toString() {
		return "Butter [Quality=" + Quality + ", Quantity=" + Quantity + ", CreamContent=" + CreamContent + "]";
	}

	
}
