/** 
* Class Calculator can take actions: + , pow , undo result. 
*/
public class Calculator{
	/**
	*field result - result actions of calculator;
	*/
	private int result;
	/**
	* @param first - first number for calculation;
	* @param second - second number for calculation;
	* method add - adds first and second number, after adds to result;
	*/
	public void add(int first, int second){
		
			this.result += first+second;
	}
	/**
	* @param base - base of degree;
	* @param exp - exponent;
	* method degree - calculate:  result + base^exp;
	*/
	public void degree(int base, int exp){
			//this.result = Math.pow(base,exp);
	}
	/**
	* method getResult() @return result of calculation;
	*/
	public int getResult(){
		return this.result;
	}
	/**
	* method cleanResult() undos result; 
	*/
	public void cleanResult(){
		this.result = 0 ;
	}
}