import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,minInd,tmp;
		int arr[]=new int[6];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length-1;i++) {
			minInd=i;
			for(j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minInd]) {
					minInd=j;
				}
			}
			tmp=arr[minInd];
			arr[minInd]=arr[i];
			arr[i]=tmp;
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
