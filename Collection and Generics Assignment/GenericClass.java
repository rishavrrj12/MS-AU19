
class MyGeneric<T> implements Comparable {

	private T ob;
	private	int val;
	
	MyGeneric(T ob , int val)
	{
		this.ob = ob;
		this.val = val;
	}
	
	public void setOb(T ob)
	{
		this.ob=ob;
	}
	
	public T getOb()
	{
		return ob;
	}
	
	public void setVal(int val)
	{
		this.val=val;
	}
	public int getVal()
	{
		return val;
	}
	
	
//	@Override
	public int compareTo(MyGeneric<T> o) {
		// TODO Auto-generated method stub
		
		if(this.val > o.val)
			return 1;
		else
			return -1;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;
		else
			return false;
	}

	
}



public class GenericClass {

	public static void main(String... args) {
		
		MyGeneric<Long> obj1 = new MyGeneric<Long>(45L,1);
		MyGeneric<Long> obj2 = new MyGeneric<Long>(45L,10);
		
		if(obj1.equals(obj2))
			System.out.println("Both objects are equal");
		else
				System.out.println("Both objects are not equal");
		
		
	}
}
