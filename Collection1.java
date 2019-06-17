import java.util.*;

public class Collection1 {

	public static void main(String... args) {
		
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		s = s.toUpperCase();
		TreeMap<Character,Integer> myMap= new TreeMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			
			if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)) { 
			
			if(myMap.get(s.charAt(i))==null)
			{
				myMap.put(s.charAt(i), 1);
			}
			else
			{
				int f = myMap.get(s.charAt(i));
				myMap.put(s.charAt(i), ++f);
			}
			}
		}
		
		  for (Map.Entry m : myMap.entrySet())
		  { 
	          System.out.print(m.getKey() +  
	                             " \t ");
	          
	          int c= (int) m.getValue();
	          while(c>0) {
	        	  
	        	  System.out.print('#');
	          c--;
	          }
	          System.out.println();
		  }
	}
}
