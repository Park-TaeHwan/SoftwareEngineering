
public class Sauce extends stockReadymade {
	private String snackTaste;//¸À
	public String getOrigin() {
		return snackTaste;
	}
	public void setOrigin(String snackTaste) {
		this.snackTaste = snackTaste;
	}
	@Override
	public String toString() {
		String str = "Taste: " + snackTaste + "\n";
		return super.toString() + str;
	}
}
