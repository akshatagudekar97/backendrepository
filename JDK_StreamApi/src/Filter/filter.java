package Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class filter {

	public static void main(String[] args) {
		
	
		List<Integer> list=new ArrayList<>(Arrays.asList(1,4,6,7,3,5,2));
		
		list.stream().filter(a-> a>=1).sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		
		
	}
}
