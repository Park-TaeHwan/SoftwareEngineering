
public class Drink extends stockReadymade {
	private String drinkPeriod;//유통기한
	public String getPeriod() {
		return drinkPeriod;
	}
	public void setPeriod(String drinkPeriod) {
		this.drinkPeriod = drinkPeriod;
	}
	
	@Override
	public String toString() {
		String str = "Period: " + drinkPeriod + "\n";
		return super.toString() + str;
	}
}
