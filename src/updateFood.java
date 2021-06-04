import java.util.ArrayList;
import java.util.Scanner;

public class updateFood {
	public static void main(String[] args) {

		View pv = new View();
		stockReadyMadeService ps = new stockReadyMadeService();
		ArrayList<stockReadymade> pList = ps.getStockList();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter food product ");
		String name = keyboard.nextLine();
		
		stockReadymade prod = ps.searchProd(name);
		int updateNum = pv.updateNum(); 
		if(prod != null) {
			if(updateNum != -1) {
				//정상적인 변경 값이 입력되었을 경우
				//서비스 클래스의 정보 수정 메소드 사용
				boolean result = ps.updateProd(name, updateNum);
				if(result) {
					System.out.println("Update success ");
				}
				else {
					//수정 실패 메시지 출력
					System.out.println("Update failed ");
				}
			}
			else {
				//엔터가 입력되었을 경우. 메시지 출력
				System.out.println("wrong ");
			}
		}
		else {
			System.out.println("none data");
		}
	}
}

