package Day7;
import java.util.*;
import java.util.stream.Collectors;
public class flatMapProductTester {

	public static void main(String[] args) {
		List<Product> pdtList1 = new ArrayList<Product>();
		List<Product> pdtList2 = new ArrayList<Product>();
		List<Product> pdtList3 = new ArrayList<Product>();
		
		pdtList1.add(new Product(101, "hp laptop", 15000));
		pdtList1.add(new Product(101, "acer laptop", 15000));
		pdtList1.add(new Product(101, "samsung", 15000));
		
		pdtList2.add(new Product(201, "hp phone", 15000));
		pdtList2.add(new Product(201, "acer", 15000));
		pdtList2.add(new Product(201, "samsung", 15000));
		
		pdtList3.add(new Product(301, "camera ", 15000));
		pdtList3.add(new Product(301, "acer", 15000));
		pdtList3.add(new Product(301, "samsung", 15000));
		
		List<List<Product>> pdts = new ArrayList<List<Product>>();
		pdts.add(pdtList1);
		pdts.add(pdtList2);
		pdts.add(pdtList3);
		
		List<Product> finalList = (pdts.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList()));
		for (Product p : finalList) {
			System.out.println(p.name);
		}
	}

}
