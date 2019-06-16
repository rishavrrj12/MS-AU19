import java.util.*;

class User
{
	String name;
	long number;
	 User(String name,long number)
	{
		this.name=name;
		this.number=number;
	}
}	
class Record {
	  HashMap<String,Long> contacts;
	 ArrayList<CallHistory> history;
	 Record()
	 {
		 history=new ArrayList<CallHistory>();
		 contacts=new HashMap<String, Long>();
	 }
}

class CallHistory {
	long caller;
	long receiver;
	long callStart;
	long callEnd;
}
interface Telephone
	{
		void call(long contactNumber);
		String receiveCalls();
		
		public long getCallHistory();
	}
	
class MyPhone extends User implements Telephone 
	{
	MyPhone(String name, long number) {
		super(name, number);
		// TODO Auto-generated constructor stub
	}



	static int i=0;
		long contactNumber;
		String userName;
		long[] callHistory;
		
		@Override
		public void call(long contactNumber) {
			// TODO Auto-generated method stub
			System.out.println("Calling to" + contactNumber);
			callHistory[i++] = i*7 +3;
		}

		@Override
		public String receiveCalls() {
			// TODO Auto-generated method stub
			System.out.println("Call Received");
			callHistory[i++] = i*7 +3;
			return null;
		}

		@Override
		public long getCallHistory() {
			// TODO Auto-generated method stub
			
			for (long p : callHistory)
			System.out.println(p + " " );
			return 0;
		}
		
	
	
	public static void main(String... args) {
		
		Scanner s=new Scanner(System.in);
		CallHistory ch = new CallHistory();
		Record r = new Record();
		
//	    User people[]=new User[5];
	    
	    LinkedList<User> people = new LinkedList<User>();
	    CallHistory callHistory = new CallHistory();
	    String a= "";
	    long b=0;
	    System.out.println("Enter the name and telephone no");
	    a=s.nextLine();
		b=s.nextLong();
		
		User u = new User(a,b);
		
		while(true){
		
		System.out.println("1. Dial a call");
		System.out.println("2. Create a contact");
		System.out.println("3. View contact");
		System.out.println("4. View call History");
		System.out.println("5. Exit");
		int choice=s.nextInt();
		
		
		switch(choice)
		{
		case 1: System.out.println("Enter the no to call");
				long rec=s.nextInt();
				System.out.println("Calling "+ rec +" ...");
				
				long callStart=System.currentTimeMillis();
				long callEnd = callEnd=System.currentTimeMillis();
				
				callHistory.caller=b;
				callHistory.receiver=rec;
				callHistory.callStart=callStart;
				callHistory.callEnd=callEnd;
				r.history.add(callHistory);
				break;
		
		
		case 2:	s.nextLine();
				System.out.println("Enter contact name");
				String contactName=s.nextLine();
				System.out.println("Enter contact no");
				long no=s.nextLong();
				r.contacts.put(contactName,no);
				System.out.println("Contact added successfully");
				break;
				
		case 3:
			for(Map.Entry m:r.contacts.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			} 
			System.out.println();
			
			break;
		case 4: for(CallHistory h : r.history) {
			System.out.println("caller :"+h.caller+" receiver :"+h.receiver+" callStart :"+h.callStart+" callEnd :"+h.callEnd);
		}
		
				break;
		case 5:
			System.exit(0);
		}
		}
	}	
}