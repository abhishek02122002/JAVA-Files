import java.lang.*;
import java.util.*;
class arrayPractice{
	public static void main(String ...args)
	{
		//Array are divided into two categories (A)One-Dimensional (B) Two Dimensional 
			// (A) One Dimensioanl Array 
			// there are two ways to define an array , .. int a[] = new int[5], a[0]=1,a[1]=2..... so on  and second way is int a[] = {1,2,4,6,7};
			// Q) ->find sum of all elements of the array 
			//    ->Searching an Element in an array 
			//	  -> Finding Maximum Element 
			//    -> Finding Second Largest Element 
			//    ->Rotating an array
			//    ->Inserting an Element 
			//    -> Deleting an Element 
			//    -> copying an array 
			//    -> Reverse copying an array 
			//    -> Increasing the size of the array

			// q1) sum of all elements of the array
			int a[] = {1,2,3,4,5,6,7,8,9};
			int sum =0;
			for(int i =0;i<a.length;i++)
			{
			sum = sum+a[i];
			}
			System.out.printf("%d",sum);
			System.out.println("\n");
			
			
			//q2)search an Element in an Array
			Scanner s = new Scanner(System.in);
			int flag;
			System.out.print("Enter the number ");
			flag=s.nextInt();
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==flag)
				{
					System.out.print("Found Element at index"+i);
					//System.exit(0); <- this will take you out of the programme.
				}
			}
			System.out.print("\n");
			//q3)Finding Maximum Element in an Array
			int[] newArray = new int[5];
			for(int i =0;i<newArray.length;i++)
			{
				newArray[i] = 2*i + (i + 2);
			} 
			
			for(int x:newArray)
			{
				System.out.print(x+" " );
			}
			int max = newArray[0];
			for(int j = 0;j<newArray.length;j++)
			{
				if( max < newArray[j] )
				{
					max = newArray[j];
				}
			}
			System.out.print(max);
			System.out.print("\n");
			//q4) Finding Second Largest Element in an Array
			int max1 = newArray[0];
			int max2 = newArray[1];
			for(int p = 0 ; p < newArray.length;p=p+1)
			{
				if(newArray[p] > max1 )
				{
					max2 = max1;
					max1 = newArray[p];
				}
				if ( max2 > newArray[p] )
				{
					max2 = newArray[p];
				}
			}
			System.out.println(max2);
			System.out.print("\n");
			
			
		//q5) Rotate Array 
		// a) right rotation
		int [ ]brr = {10,20,30,40};
		int last$element$value = brr[brr.length - 1];
		for(int h = brr.length-1; h >= 1  ; h = h - 1)
		{
			brr[h] = brr[h - 1];
		} 
		brr[0] = last$element$value;
		
		for(int x:brr)
		{
			System.out.print(x+" ");
		}
		System.out.println("\n");
		
		// Inserting an Element in the array
			int crr[] = new int[10];
			crr[0]=10;
			crr[1]=20;
			crr[3]=30;
			crr[4]=40;
			crr[5]=50;
		Scanner input = new Scanner(System.in);
		int inputNumber,radixNumber;
		System.out.print("Enter the number:- \t");
		inputNumber = input.nextInt();
		System.out.print("Enter the radix value:-\t");
		radixNumber = input.nextInt();
		int i = brr.length ;
		//while(i > radixNumber )
		// {
		//	brr[i] = brr[i-1];
		//	i--;
		// }
		for(int q = crr.length;q> radixNumber;q--){
			crr[q] = crr[q-1];
		}
		brr[radixNumber] = inputNumber;
		for(int k:crr){
			System.out.print(k+"\t");
		}
		
		
		

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}