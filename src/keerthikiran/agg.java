package keerthikiran;
import java.util.*;
public class agg {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		bag c=new bag("red",100);
		System.out.println(c.color);
		System.out.println(c.price);
		c.getbook();
		System.out.println(c.b.name);
		System.out.println(c.b.price);
		c.remove();
		
		
		
	}

}
