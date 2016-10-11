import java.util.ArrayList;

public class NumberBag {
	private ArrayList<Integer> list;
	private int maxValue;
	
	public NumberBag(int max){
		list = new ArrayList<Integer>();
		maxValue = max;
	}
	
	public boolean add(int n){
		if(n < 0 || n > maxValue) return false;
		
		list.add(n);
		return true;
	}
}
