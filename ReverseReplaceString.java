package assignment;
import java.util.*;
public class ReverseReplaceString {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner read =new Scanner(System.in);
		String str=read.nextLine();
	 StringBuilder stri=new StringBuilder(str);
	stri.reverse();
	System.out.println("Reversed String : "+stri);
	str=stri.toString();
	str=str.replace('t','L');
     str=str.replace('T','L');
     System.out.println(str);
	}

}
