import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[6];
		int i,j,tmp;
		boolean  swap=false;
		Scanner ob=new Scanner(System.in);
		for(i=0;i<arr.length;i++)
		{
			arr[i]=ob.nextInt();
		}
		for(i=0;i<arr.length-1;i++)
		{	
			swap=false;
			for(j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1]) {
					
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
					swap=true;
				}
				}
			if(swap==false) {
				break;
			}
			}
		System.out.println(i+"i value");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
