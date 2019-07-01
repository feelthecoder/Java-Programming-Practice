package assignment;
import java.util.*;

public class MonthDate {

	public static void main(String[] args) {
		String[] month= {"Jnuary","February","March","April","May","June","July","August","September","October","November","Decemer"};
		int d,m,y;
		System.out.println("Enter the date :");
		Scanner nb=new Scanner(System.in);
		d=nb.nextInt();
		m=nb.nextInt();
		y=nb.nextInt();
		System.out.println("Month : "+month[m-1]);
		
		
	}

}
