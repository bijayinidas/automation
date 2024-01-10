import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*for(int i=0;i<100;i++)

	{
	if(i%2==0)
	{
		System.out.println(i);
	}
	}
	   
		for(int i=0;i<100;i++) {
			
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		*/
		Scanner input=new Scanner(System.in);
		System.out.println("enter your choice");
		int ch=input.nextInt();
		for(int i=1;i<=ch;i++)
		{
		int a=input.nextInt();
		if(a%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		}
		
		Array_test obj=new Array_test();
		obj.arr_call();
	}

}
