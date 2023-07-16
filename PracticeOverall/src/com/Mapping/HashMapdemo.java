package com.Mapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapdemo {
	
	public static void main(String[] args) {
	
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		hm.put(10, 1000);
		hm.put(20, 2000);
		hm.put(30, 3000);
		hm.put(40, 4000);
		hm.put(50, 5000);
		hm.put(30, 3000);
		hm.put(40, 4000);
		hm.put(50, 5000);
		
		hm.entrySet()
			.stream()
			.filter(m->m.getKey()>30)
			.forEach(s->System.out.println(s));
	
		hm.forEach((k,v)->System.out.println("Key :"+k+" Value :"+v));
	
		System.out.println("Sorted list  :");
		
		hm.entrySet()
			.stream()
			.sorted((k1,k2)->k1.getKey()
			.compareTo(k2.getKey()))
			.forEach(k->System.out.println("key :"+k.getKey()+" Value :"+k.getValue()));
	
		System.out.println("Sorted Descending list based on keys  :");
	
		hm.entrySet()
			.stream()
			.sorted((k1,k2)->k2.getKey()
			.compareTo(k1.getKey()))
			.forEach(p->System.out.println("Key:"+p.getKey()+" Value :"+p.getValue()));
		
		
		System.out.println("Sorted Descending list based on keys use distinct for remove duplicate :");
		
		hm.entrySet()
		.stream()
		.sorted((k1,k2)->k2.getKey()
		.compareTo(k1.getKey())).distinct()
		.forEach(p->System.out.println("Key:"+p.getKey()+" Value :"+p.getValue()));
	

System.out.println("Sorted Descending list based on keys use Limit :");
		
	List<Entry<Integer, Integer>> collect = hm.entrySet()
		.stream()
		.sorted((k1,k2)->k2.getKey()
		.compareTo(k1.getKey()))
		//.distinct()
		.limit(5)
		.collect(Collectors.toList());
	
		
		//System.out.println(collect);
	   collect.forEach(System.out::println);
		 
	}}
