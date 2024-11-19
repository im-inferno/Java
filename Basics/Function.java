
public class Function {

	public static void main(String[] args) {
		int a = 20;
		int b = 17;
		double result = findAvg(a,b);
		System.out.println("The average is : "+result);
	}
	static int sum(int a,int b) {
		return a+b;
	}
	static double findAvg(int a,int b) {
		double c = (double)sum(a,b)/2;
		return c;
	} 

}
