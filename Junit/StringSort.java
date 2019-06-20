package com.test.junit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class StringSort {

	public static List<String> sortString(String[] input){
		
		Map<String,Integer> map = new HashMap<>();
		for(String s : input)
		{
			int count = map.getOrDefault(s, 0); 
            map.put(s, count + 1); 
		}
		List<Map.Entry<String, Integer>> entries=new ArrayList<>(map.entrySet());
		
		Collections.sort(entries,new Comparator<Map.Entry<String, Integer>>() {
			
			@Override
			public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2) {
				
				if(o1.getValue() <= o2.getValue())
					return 1;
				else
					return -1;
				
			}
		} );
		List<String> finalList  = new ArrayList<String>();
		for(Map.Entry<String, Integer> entry:entries)
		{
			finalList.add(entry.getKey());
		}
		return finalList;

	}
	
		public static void main(String... args)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of elements");
			int n=sc.nextInt();
			String input[]=new String[n];
			System.out.println("Enter the string elements");
			for(int i=0;i<n;i++)
			{
				input[i]=sc.next();
			}
			List<String> l= sortString(input);
			
			
			for(String s : l)
			{
				System.out.println(s + " ");
			}
		}
}