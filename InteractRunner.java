import java.util.Scanner;
/**
*@author Maria
*
*/
public class InteractRunner{
		/**
		* Method calculate value of action of operator
	    * @param operator - operator for calculation result of numbers
		*/
		public void calculate(String operator,String first, String second, Calculator calc)
			{
				Scanner reader = new Scanner(System.in);
				Boolean input = false;
				/**
				* cycle will run until the user will enter an correct operation( +, -, *, /);
				*/
				while(input.equals(false)){
					switch(operator){
						case "+" :
							    calc.add(Integer.valueOf(first),Integer.valueOf(second));
								input = true; //out of the cycle;
								break;
						case "-" :
							    calc.sub(Integer.valueOf(first),Integer.valueOf(second));
								input = true; //out of the cycle;
								break;
						case "*" :
							    calc.mult(Integer.valueOf(first),Integer.valueOf(second));
								input = true; //out of the cycle;
								break;
						case "/" :
								try{
									calc.div(Integer.valueOf(first),Integer.valueOf(second));
								}catch(Exception e){
									System.out.println("division by zero!");
									input = true; //out of the cycle;
								}
								input = true; //out of the cycle;
								break;
						default:
								System.out.println("Entered incorrect data. Select the action (+, -, *, /) : ");
								operator = reader.next();
					}
				}
			}
		/**
		* 
	    * @param annulment -user's request to clean result or no(yes/no)
		*/
		public void undoOrNot(String annulment,Calculator calc,Scanner reader){
			Boolean input = false;
			/** cycle will run until the user will enter an correct value( yes/no )*/
			while(input.equals(false)){
				if(annulment.equals("yes")){
					calc.cleanResult();
					input = true;//out of the cycle;
				}
				else if(annulment.equals("no")){input = true;}//out of the cycle;
				else{
					System.out.println("Entered incorrect data. Enter yes/no for clean result : ");
					annulment = reader.next();
				}
			}
		}
		public static void main(String[] arg){
		Calculator calc = new Calculator();
		Scanner reader = new Scanner(System.in);
		InteractRunner interact =new InteractRunner();
		try{
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Enter first arg : ");
				/** user input first number */
				String first = reader.next();
				System.out.println("Enter second arg : ");
				/** user input second number */
				String second = reader.next();
				System.out.println("Enter action (+, -, *, /) : ");
				/** user input operator for calculation */
				String operator = reader.next();
				
				interact.calculate(operator,first,second,calc);
				
				System.out.println("Result : "+calc.getResult());
				System.out.println("Enter yes/no for clean result : ");
				/** user input value for undo/not undo result */
				String annulment = reader.next();
				
				interact.undoOrNot(annulment,calc,reader);
				
				System.out.println("Enter yes/no for exit : ");
				/** user input value for exit/not exit result */
				exit = reader.next();//out of the cycle;
				while(!(exit.equals("yes")||exit.equals("no"))){
					System.out.println("Entered incorrect data. Enter yes/no for exit : ");
					exit = reader.next();
				}
			}
		}
		finally{
			reader.close();
		}	
	}

		
			
	}	
