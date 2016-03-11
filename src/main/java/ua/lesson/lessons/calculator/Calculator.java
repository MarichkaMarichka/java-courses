package ua.lesson.lessons.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
* Calculator can take actions: + ,- ,* ,/ ,clean result
*/
public class Calculator{
	private final Map<String,Action> operation = new HashMap<String,Action>();

	public Calculator(){
		this.load(new Add());
		this.load(new Sub());
		this.load(new Mult());
		this.load(new Div());
	}


	public void calculate(int first, int second, String operation){
		this.result = this.operation.get(operation).arithmetical(first,second);
	}
	public void load(Action action){
		this.operation.put(action.operation(),action);
	}
	public static final class Add implements Action{
		public String operation() {
			return "+";
		}
		public int arithmetical(int first, int second) {
			return first + second;
		}
	}



	public static final class Sub implements Action{
		public String operation() {
			return "-";
		}
		public int arithmetical(int first, int second) {
			return first - second;
		}
	}



	public static final class Mult implements Action{
		public String operation() {
			return "*";
		}
		public int arithmetical(int first, int second) {
			return first * second;
		}
	}



	public static final class Div implements Action{
		public String operation() {
			return "/";
		}
		public int arithmetical(int first, int second)  {
			int temp = first/second;
			return temp;
		}
	}
	/**
	* field result - result actions of calculator
	*/
	private int result;
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