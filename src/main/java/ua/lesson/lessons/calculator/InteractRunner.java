package ua.lesson.lessons.calculator;

import ua.lesson.lessons.io.Input;
import ua.lesson.lessons.io.Output;

/**
*@author Maria
*
*/
public class InteractRunner {
	private final Output output;
	private final Input input;
	private final Calculator calculator;

	InteractRunner(Output output, Input input, Calculator calculator) {
		this.output = output;
		this.input = input;
		this.calculator = calculator;
	}

	public void action()  {
		String exit = "no";
		String first;
		String second;
		String operator;
		do {
			first = input.ask("Enter first arg : ");
			second = input.ask("Enter second arg : ");
			operator = input.ask("Enter action (+, -, *, /) : ");

			this.calculator.calculate(Integer.valueOf(first), Integer.valueOf(second), operator);

			output.println("Result : " + calculator.getResult());
			if ("yes".equals(input.ask("Enter 'yes' for clean result or any other symbol to save result and continue  : ")))
				calculator.cleanResult();
			exit = input.ask("Enter 'no' to continue or any other symbol to  exit : ");

		} while (exit.equals("no"));
	}


}


