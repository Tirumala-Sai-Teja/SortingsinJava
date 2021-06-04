import java.util.*;
public class InsertionSort {
public static void main(String []args) {
	int arr[]=new int[6];
	int i,j;
	Scanner ob=new Scanner(System.in);
	for(i=0;i<arr.length;i++)
	{
		arr[i]=ob.nextInt();
	}
	for(i=1;i<arr.length;i++)
	{
		j=i-1;
		int key=arr[i];
		while(j>=0 && arr[j]>key) {
			arr[j+1]=arr[j];
			j-=1;
		}
		arr[j+1]=key;
	}
	for(i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
