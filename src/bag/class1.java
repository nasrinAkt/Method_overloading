package bag;

public class class1 {

	public static void main(String[] args) {
		class1 red = new class1();
		red.flower(500);
		red.flower(70, 80);
		class1.flower(12, 13, 15);

	}
public void flower(int a) {
	
System.out.println(a);	
	
}
public void flower(int a, int b) {
int c = a+b;
System.out.println(c);
	
}	
public static void flower(int a, int b,int c) {
int d = a+b+c;
System.out.println(d);
	
	
}	
}
