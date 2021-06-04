import java.util.ArrayList;
import java.util.Scanner;

public class View {
	private Scanner scan = new Scanner(System.in);
	public int inputNum() {
		//scanner의 문제 
		//번호 뒤에 문자열을 입력받을 때 입력이 안되는 문제
		String str = scan.nextLine();//입력은 문자열로..
		int num = -1;

		//숫자를 입력하지 않고 엔터를 쳤을 때의 예외사항 막기.
		if(!str.equals("")) {
			num = Integer.parseInt(str);
		}

		return num;
	}//숫자 입력 메소드 끝
	
	public void printProduct(ArrayList<stockReadymade> pList, int c) {
	int cnt = 0;//카테고리별 출력 시 제품 개수 카운트

		for(stockReadymade p : pList) {
			switch(c) {
				case 0:
					System.out.println(p);
					break;
			}//switch 끝
		}
	}
	public void searchResult(stockReadymade p) {
		//전달받은 제품 인스턴스 출력
		System.out.println("Search result");
		System.out.println(p);
	}
	public int updateNum() {
		System.out.print("update nember: ");
		
		int uNum = inputNum();
		
		return uNum;
	}

}
