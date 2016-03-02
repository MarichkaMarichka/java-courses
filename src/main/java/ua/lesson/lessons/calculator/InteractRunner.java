package ua.lesson.lessons.calculator;

import ua.lesson.lessons.io.Input;
import ua.lesson.lessons.io.Output;

import java.util.Scanner;
/**
*@author Maria
*
*/
public class InteractRunner{
	private final Output output;
	private final Input input;
	private final Calculator calculator;
	InteractRunner(Output output, Input input, Calculator calculator){
		this.output = output;
		this.input = input;
		this.calculator = calculator;
	}

	public void action() {
		Calculator calc = new Calculator();

			String exit = "no";
			do {
				String first = input.ask("Enter first arg : ");
				String second = input.ask("Enter second arg : ");
				String operator = input.ask("Enter action (+, -, *, /) : ");
				this.calculator.calculate(Integer.valueOf(first), Integer.valueOf(second),operator);

				output.println("Result : " + calc.getResult());
				if ("yes".equals(input.ask("Enter yes/no for clean result : ")))
					calc.cleanResult();


				exit = input.ask("Enter yes/no for exit : ");

			}while (exit.equals("no"));
	}

		
			
	}	
