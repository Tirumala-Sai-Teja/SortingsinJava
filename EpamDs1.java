import java.util.*;
public class Main
{
    static int days=0;
	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList<Integer> al=new ArrayList();
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
for(int i=0 ;i<n; i++){
	al.add(sc.nextInt());
}
		   Main m=new Main();
		   if(al.size()>1){
			     m.formArray(al);
		   }
		 else{
			 
			 System.out.println(days);
		 }
		  //formArray(al);
		if(days==0 && n>1) days=1;
		System.out.println(days+"there");
	}
	
	int formArray(ArrayList<Integer> al){

	    ArrayList al2=new ArrayList();
	     for(int i=0;i<al.size();i++){
			 if(i==0){al2.add(al.get(i)); continue;}
		        if(al.get(i-1) < al.get(i)) continue;
		        
		        al2.add(al.get(i));
		        
		    }
			 System.out.println(al2.toString());
		    if(al2.size()>1){
				
				if(al.equals(al2)) return days;
					    days++;
						 System.out.println("coming here");
		   formArray(al2);}
		   
		   return days;
	}
}
/*output:
7
6,5,8,4,7,10,9
o/p:2
i/p:
0
o/p:0
i/p:1
8
o/p:1
i/p:3
3 2 1
o/p:1*/
