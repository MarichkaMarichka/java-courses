import java.util.Scanner;
public class InteractRunner{
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				System.out.println("Enter '+'/'pow' : ");
				String operator = reader.next();
				Boolean input = false;
				while(input.equals(false)){
					switch(operator){
						case "+" :
							    calc.add(Integer.valueOf(first),Integer.valueOf(second));
								input = true;
								break;
						case "pow" :
								calc.exponent(Integer.valueOf(first),Integer.valueOf(second));
								input = true;
								break;
						default:
								System.out.println("Select the action : ");
								operator = reader.next();
								}
							}
				System.out.println("Result : "+calc.getResult());
				System.out.println("Undo result : yes/no");
				String annulment = reader.next();
				input = false;
				while(input.equals(false)){
		        if(annulment.equals("yes")){
					calc.cleanResult();
					input = true;
				}
				if(annulment.equals("no")){
					input = true;
				}}
				System.out.println("Exit: yes/no");
			exit = reader.next();}
			}finally{
				reader.close();
			}
			
		}
	}	
