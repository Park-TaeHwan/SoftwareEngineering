import java.util.ArrayList;

public class printService {
	stockReadyMadeService ps = new stockReadyMadeService();
	private void printProduct() {
		ps.startPs();
		ArrayList<stockReadymade> pList = ps.getStockList();
		
	}
}
