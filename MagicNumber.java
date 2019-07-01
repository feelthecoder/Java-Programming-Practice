package assignment;
import java.util.*;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		int number,product,sum=0,revnum=0,r,num,rev;
		Scanner in =new Scanner(System.in);
	System.out.println("Enter the number to be checked :");
	number=in.nextInt();
	rev=number;
	while(number!=0)
	{
		r=number%10;
		sum=sum+r;
		number/=10;
	}
	num=sum;
	while(sum!=0)
	{
		r=sum%10;
		revnum=revnum*10+r;
		sum/=10;
		
	}
	product=revnum*num;
	if(product==rev)
		System.out.println("Magic Number");
	else
		System.out.println("Not Magic Number");
	
	
	}

}
