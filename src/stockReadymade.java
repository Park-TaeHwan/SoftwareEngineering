import java.util.ArrayList;
import java.util.Scanner;


public class stockReadymade {
	private String name;//제품명
	private String readyMadeCategory; //카테고리
	private int amount;//수량
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return readyMadeCategory;
	}
	public void setCategory(String readyMadeCategory) {
		this.readyMadeCategory = readyMadeCategory;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		String str = "======================\n"
				+ "Name: " + name + "\n"
				+ "Amount: " + amount + "\n"
				+ "Category: " + readyMadeCategory + "\n";
		
		return str;
	}
}
