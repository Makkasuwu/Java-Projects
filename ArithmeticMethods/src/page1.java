
public class page1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//variables		
int number1 = 5;
int number2 = 3;
 displayNumberPlus10(number1,number2);
 displayNumberPlus100(number1,number2);
 displayNumberPlus1000(number1,number2);

 
 }
 
 
 
 public static void displayNumberPlus10(int n, int m) {
	 final int FACTOR = 10;
	 System.out.println((n * FACTOR)+" "+(m * FACTOR));
 }
 public static void displayNumberPlus100(int n, int m) {
	 final int FACTOR = 100;
	 System.out.println((n * FACTOR)+" "+(m * FACTOR));
 }
 public static void displayNumberPlus1000(int n, int m) {
	 final int FACTOR = 1000;
	 System.out.println((n * FACTOR)+" "+(m * FACTOR) );
 }
 
 }