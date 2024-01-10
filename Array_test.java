import java.util.Scanner;

public class Array_test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	
		Array_test obj=new Array_test();
		obj.arr_call();
	}
	public void arr_call()
	{

		//	String[] arr=new String[5];
			int[] arr=new int[5];
			Scanner input=new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				arr[i]=input.nextInt();

				
			}
			for(int i=0;i<5;i++)
			{
			System.out.println(arr[i]);
			}
	}

}
