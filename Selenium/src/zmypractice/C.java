package zmypractice;
import java.util.*;

public class C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a String");
			String s1=sc.nextLine();
			
			System.out.println("Enter a String");
			String s2=sc.nextLine();
			
			System.out.println(s1==s2);
		}
	}
}
