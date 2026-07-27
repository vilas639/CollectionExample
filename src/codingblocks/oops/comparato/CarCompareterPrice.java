package codingblocks.oops.comparato;

import java.util.Comparator;



public class CarCompareterPrice implements Comparator<Cars> {

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o2.price - o1.price;
	}
}
