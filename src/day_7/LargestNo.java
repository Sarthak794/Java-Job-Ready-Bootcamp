package day_7;
import java.util.*;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list  = new ArrayList<>();
		list.add(10);
		list.add(29);
		list.add(88);
		list.add(67);
		list.add(25);
		int largest = list.get(0);
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>largest) {
				largest = list.get(i);
			}
		}System.out.println("Largest Number : "+largest);

	}

}
