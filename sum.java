package nicebanjara;

public class sum {

	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int s=0;
		for(int i=a;i<=b;i++)
		{
			s+=i;
		}
			System.out.println("the value is" +s);
	}
		static void display()
		{
			System.out.println("Nice Banjara");
		}
		public static int total (int i1,int i2) {
		int add=0;
		for (int i=i1;i<=i2;i++)
		{
			add+=i;
		}

		return add;
		}
		public static void main(String[] args) {
		sum z = new sum();
		z.add(10, 20);
		System.out.println("add from 1 to 20 is" +total(1,90));
		System.out.println("add from 20 to 30 is" +total(60,30));
		System.out.println("add from 35 to 45 is" +total(5,5));
		display();
		}

}
