package dec21java;

import java.util.Scanner;

public class NumberRotation {

	public static void main(String[] args) {
int[] num= {10,20,30,40,50};
System.out.println("before rotation");
for(int i=0;i<num.length;i++) {
	System.out.print(num[i]+" ");
}

System.out.println();
System.out.println("how many times want to rotate");
Scanner sc = new Scanner(System.in);
int no = sc.nextInt();
while(no !=0) {
	
	int last = num[num.length-1];
	
	for(int i=num.length-1;i>0;i--) {
		num[i]= num[i-1];// 4--3
	}
	num[0]= last;
	
	no--;
	
	
}



System.out.println("after 1 rotation");
for(int i=0;i<num.length;i++) {
	System.out.print(num[i]+" ");
}

	
	}

}
