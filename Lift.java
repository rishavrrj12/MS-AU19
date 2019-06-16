import java.util.*;

public class Lift {

	public static void main(String... args)
	{
		int noOfUser , destFloor ,currFloor ,userInEachLift ;
		
		System.out.println("Enter No of User");
		Scanner sc = new Scanner(System.in);
		noOfUser = sc.nextInt();
		
		Map<Integer,List<Integer>> mymap = new HashMap<>();
		
		userInEachLift= noOfUser/2;
		for(int i=1;i<=noOfUser;i++)
		{
			System.out.println("Enter destination floor for user "+ i);
			destFloor = sc.nextInt();
			if(!mymap.containsKey(destFloor))
			{
				List<Integer> ints = new ArrayList<Integer>();
			     ints.add(i);
			     mymap.put(destFloor,ints);
			}
			else
			{
				List<Integer> ints = mymap.get(destFloor);
				ints.add(i);
				mymap.put(destFloor,ints);
			}
			
		}
		System.out.println("Enter current floor of all users");
		currFloor = sc.nextInt();
		
		
		int count=0;
		System.out.print("Users in Lift A = ");
		  
		 for(Map.Entry m:mymap.entrySet()){
			 
	        List<Integer> p= (List<Integer>) m.getValue(); 
 			 
	           if(count < userInEachLift)
	           {
	        	   for(int i : p) {
	        		   
	        		   if(count < userInEachLift)
	        		   System.out.print(i + " ");
	        		   else if(count == userInEachLift)
	        		   {
	        			   System.out.print("\n3Users In Lift B = ");
	        			   System.out.print(i + " ");
	        		   }
	        		   else
	        			   System.out.print(i + " ");
	        		   
	        		   count++;
	        	   					}
	           }
	         else {
	        		   for(int i : p) {
	        		    if(count == userInEachLift)
	        		   {
	        			   System.out.print("\nUsers In Lift B = ");
	        			   System.out.print(i + " ");
	        		   }
	        		   else
	        			   System.out.print(i + " ");
	        		    count++;
	        		   				
	        		   				}
	           	}
	       }
	           
	   }  		
}
