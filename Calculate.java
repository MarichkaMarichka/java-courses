public class Calculate{
	public static void main(String[] arg){
		double first = Double.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		double degree = Math.pow(first, 2);
		double division = first/second;
		System.out.println("division " + division);
	}
}