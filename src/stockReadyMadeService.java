import java.util.ArrayList;

public class stockReadyMadeService {
	private ArrayList<stockReadymade> pList = new ArrayList<>();
	public void startPs() {
		TestDataInput tdi = new TestDataInput();
		tdi.addTestData(pList);
	}
	
	public ArrayList<stockReadymade> getStockList(){
		return pList;
	}
	public boolean registProd(stockReadymade p) {
		pList.add(p);
		
		
		return true;
	}
	public boolean updateProd(String name, int uNum) {
		for(stockReadymade p : pList) {
			if(name.equals(p.getName())) {
				p.setAmount(uNum);
				return true;
			}
		}
		
		return false;
	}

	public stockReadymade searchProd(String name) {
		for(stockReadymade p : pList) {
			if(name.equals(p.getName())) {
				return p;
			}
		}
		
		return null;//검색 결과 없음.(해당 제품 없음)
	}
}
