/** 
* Calculator can take actions: + ,- ,* ,/ ,clean result 
*/
public class Calculator{
	/**
	* field result - result actions of calculator
	*/
	private int result;
	/**
	* Adds numbers
	* @param params - list of numbers for adding
	*/
	public void add(int ... params){
		if(this.result == 0){this.result = params[0];}
		else{this.result += params[0];}
		for(int i = 1; i < params.length; i++){
			this.result += params[i];
		}
	}
	/**
	* Subtracts numbers
	* @param params - list of numbers for subtraction
	*/
	public void sub(int ... params){
		if(this.result == 0){this.result = params[0];}
		else{this.result -= params[0];}
		for(int i = 1; i < params.length; i++){
			this.result -= params[i];
		}
	}
	/**
	* Multiplies numbers
	* @param params - list of numbers for multiplication
	*/
	public void mult(int ... params){
		if(this.result == 0){this.result = params[0];}
		else{this.result *= params[0];}
		for(int i = 1; i < params.length; i++){
			this.result *= params[i];
		}
	}
	/**
	* Divides numbers
	* @param params - list of numbers for division
	*/
	public void div(int ... params) throws Exception{
		if(this.result == 0){this.result = params[0];}
		else{this.result /= params[0];}
		for(int i = 1; i < params.length; i++){
			if( params[i] == 0 ){
				this.result = 0;
				throw new Exception("division by zero!");
				}
			this.result /= params[i];
		}
	}
	/**
	* Gets result
	* @return result of calculation
	*/
	public int getResult(){
		return this.result;
	}
	/**
	* Cleans result
	*/
	public void cleanResult(){
		this.result = 0 ;
	}
}