import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileNotFoundException;

public class Insert {
	View pv = new View();
	stockReadyMadeService ps = new stockReadyMadeService();
	String name;
	int total;
	String special;
	String sortClass;
	String[][] stu_arr = new String[120][4];
	 public void getTxt() throws IOException{
		  try{
		   BufferedReader br=new BufferedReader(new FileReader(new File("123.txt")));  
		   String str="";
		  
		   str=br.readLine(); 
		  
		   int i=0;
		   while(str != null){  
			 String [] temp =str.split(",");
			name = temp[0];
			total = Integer.parseInt(temp[1]);
			special = temp[2];
			sortClass = temp[3];
			
			stockReadymade p = null;
			switch(temp[3]) {
			case "Sauce"://가전제품 등록
				//가전제품용 인스턴스(저장 공간 만들기)
				p = new Sauce();
				break;
			case "Snack"://생필품 등록
				//생필품용 인스턴스(저장 공간 만들기)
				p = new Snack();
				break;
			case "Drink"://식품 등록
				//식품용 인스턴스(저장 공간 만들기)
				p = new Drink();
				break;
			default:
				//잘못된 메뉴 번호 입력에 대한 메시지 출력(뷰 클래스)
			}
			
			p.setName(name);
			p.setAmount(total);
			p.setCategory(temp[3]);
			
			if(p instanceof Sauce) {
				Sauce ep = (Sauce)p;
				ep.setOrigin(special);
			}
			else if(p instanceof Snack) {
				Snack lp = (Snack)p;
				lp.setOrigin(special);
			}
			else {
				Drink fp = (Drink)p;
				fp.setPeriod(special);
			}
			boolean result = ps.registProd(p);
			if(result) {
				//저장 완료 메시지 출력(뷰 클래스)
				System.out.println("Saved");
			}
			else {
				System.out.println("Not Saved");
			}
		   str=br.readLine();
		   i++;
		   }
		   ArrayList<stockReadymade> pList = ps.getStockList();
		   for(stockReadymade p : pList) {
			   System.out.println(p);
			}
		  }
		   catch(FileNotFoundException e){
		   System.out.println("파일명을 찾을 수 없습니다.");
		  }catch(NullPointerException e){
		   System.out.println("Err : "+e);
		  } //end try-catch
		  updateFood();
		  
	 } //end getTxt()
	 
	 private void updateFood() {
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
		
		for(stockReadymade s : pList) {
			 System.out.println(s);
		}
	}
	 
		

	private void printProduct() {
		 stockReadyMadeService ps = new stockReadyMadeService();
			ps.startPs();
			ArrayList<stockReadymade> pList = ps.getStockList();
			pv.printProduct(pList,0);
		}
	 
	 private void updateProduct() {
		 ArrayList<stockReadymade> pList = ps.getStockList();
	 }

	public static void main(String[] args) throws Exception {
		Insert obj=new Insert();
		 obj.getTxt(); //data.txt 으로부터 값을 분석


		String fileName = "123.txt";
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(fileName));
				
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			System.exit(0);
		}
		while(inputStream.hasNextLine())
		{
			String line = inputStream.nextLine();
			System.out.println(line);
		}
		inputStream.close();
	    }
}
