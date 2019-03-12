package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	static void majority(int arr[]) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer i : arr) {


			if (map.containsKey(i)) {

				int new_val = map.get(i) + 1;
				map.put(i, new_val);
			}

			else {
				map.put(i, 1);
			}

		}
		
		
		Integer max = Integer.MIN_VALUE ;
		Integer key = null;
		
		for(Map.Entry<Integer, Integer> e: map.entrySet()){
			System.out.println(e.getKey() + "-->"+ e.getValue());
			
			if(e.getValue() > max){
				max = e.getValue();
				key = e.getKey();
			}
		}
		
		System.out.println("Most occured elemet is "+ key);

	}

	public static void main(String[] args) {

		int arr[] = { 2, 2, 2, 2, 5, 5, 2, 3, 3 };

		majority(arr);

	}

}
