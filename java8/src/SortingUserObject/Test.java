package SortingUserObject;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	
	public static void main(String[] args) {
		
		ArrayList<player> play=new ArrayList<>(Arrays.asList(new player(1,"abc"),
				new player(2,"xba"),
				new player(3,"vuds"),
				new player(4,"wqqa")));
		
		
		//second way we create a object
		
		play.add(new player(5,"bvcx"));
		
		
		System.out.println(play);
		
		
		play.stream().sorted((a,a1)->a.getPid()-a1.getPid()).forEach(System.out::println);
		
		
		List<player> list =play.stream().sorted((a,a1)-> a.getPid()-a1.getPid()).collect(Collectors.toList());
		
		
		list.forEach(System.out::println);
		
		
		
		
		/*
		 * Map<Integer, String>
		 * list=play.stream().collect(Collectors.toMap(a->a.getPid(), a->a.getName()));
		 * list.forEach((k,v)->System.out.println("productid = "+k + " " +
		 * "productname = "+v));
		 * 
		 * 
		 * //price greater than 1000
		 * 
		 * Map<Integer, String>
		 * list1=play.stream().filter(a1->a1.getName().length()>2).collect(Collectors.
		 * toMap(a->a.getPid(), a->a.getName())); list1.forEach((k,v)->System;
		 * 
		 */
		
	}
}
