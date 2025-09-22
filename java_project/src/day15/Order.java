package day15;

import java.util.HashMap;
import java.util.Map;

public class Order {
	
	private Map<Sale<String, Integer>, Integer> order = new HashMap<>();
	private int total;

	public Order() {}
	
	public void addSale(Sale<String, Integer> s, int cnt) {
		if (cnt <= 0) {
			return;
		}
		
		order.put(s, cnt);
		total += s.getPrice() * cnt;
	}
	
	public void removeSale(Sale<String, Integer> s) {		
		if (order.containsKey(s)) {
			total -= s.getPrice() * order.get(s);
			order.remove(s);
		}
	}
	
	public Map<Sale<String, Integer>, Integer> getOrder() {
		return order;
	}

	public int getTotal() {
		return total;
	}
	
}
