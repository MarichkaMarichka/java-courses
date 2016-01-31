import java.util.Scanner;
/**
*
*/
public class InteractRunner{
	public static void main(String[] arg){
		Calculator calc = new Calculator();
		Scanner reader = new Scanner(System.in);
		try{
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Enter first arg : ");
				/** user input first number */
				String first = reader.next();
				System.out.println("Enter second arg : ");
				/** user input second number */
				String second = reader.next();
				System.out.println("Enter '+'/'pow' : ");
				/** user input operator for calculation */
				String operator = reader.next();
				
				calculate(operator,first,second,calc);
				
				System.out.println("Result : "+calc.getResult());
				System.out.println("Undo result : yes/no");
				/** user input value for undo/not undo result */
				String annulment = reader.next();
				System.out.println("Exit: yes/no");
				
				undoOrNot(annulment,calc);
				
				/** user input value for exit/not exit result */
				exit = reader.next();//out of the cycle;
			}
		}
		finally{
			reader.close();
		}	
	}
		/**
		* 
	    * @param annulment -user's request to clean result or no(yes/no)
		*/
		public static void undoOrNot(String annulment,Calculator calc){
			Boolean input = false;
			/**
			* cycle will run until the user will enter an correct value( yes/no );
			*/
			while(input.equals(false)){
				if(annulment.equals("yes")){
					calc.cleanResult();
					input = true;//out of the cycle;
				}
				else if(annulment.equals("no")){
					input = true;//out of the cycle;
				}
			}
		}
		/**
		* Method calculate value of action of operator
	    * @param operator - operator for calculation result of numbers
		*/
		public static void calculate(String operator,String first, String second, Calculator calc)
			{
				Scanner reader = new Scanner(System.in);
				Boolean input = false;
				/**
				* cycle will run until the user will enter an correct operation( +, pow );
				*/
				while(input.equals(false)){
					switch(operator){
						case "+" :
							    calc.add(Integer.valueOf(first),Integer.valueOf(second));
								input = true; //out of the cycle;
								break;
						case "pow" :
								//calc.exponent(Integer.valueOf(first),Integer.valueOf(second));
								input = true; //out of the cycle;
								break;
						default:
								System.out.println("Select the action : ");
								operator = reader.next();
					}
				}
			}
			
	}	
