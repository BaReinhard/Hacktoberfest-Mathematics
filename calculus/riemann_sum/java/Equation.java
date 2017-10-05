import java.util.HashMap;
import java.util.Stack;

public class Equation
{

	private String infixString;
	private String tempInfixString;
	private HashMap<Character, Integer> operatorValues;

	public Equation(String eq)
	{
		operatorValues = new HashMap<Character, Integer>();
		operatorValues.put('+', 0);
		operatorValues.put('-', 0);
		operatorValues.put('*', 1);
		operatorValues.put('/', 1);
		operatorValues.put('^', 2);

		infixString = convertToInfix(eq);
		tempInfixString = infixString;

	}

	private String convertToInfix(String eq)
	{
		String output = "";
		eq = eq.replaceAll(" ", "");
		Stack<Character> operators = new Stack<Character>();
		boolean wasNum = false;
		for (int i = 0; i < eq.length(); i++)
		{
			char currentChar = eq.charAt(i);
			if (operatorValues.containsKey(currentChar))
			{
				if(wasNum)
				{
					output += " ";
				}
				while ((operators.size() != 0 && operators.peek() != '(')
						&& (operatorValues.get(currentChar) <= operatorValues.get(operators.peek())
								&& operatorValues.get(currentChar) != 2))
				{
					output += operators.pop() + " ";
				}
				operators.push(currentChar);
			} else if (currentChar == '(')
			{
				operators.push(currentChar);
			} else if (currentChar == ')')
			{
				if(wasNum)
				{
					output += " ";
				}
				while (operators.size() != 0 && operators.peek() != '(')
				{
					output += operators.pop() + " ";
				}
				operators.pop();
			} else
			{
				output += currentChar;
				wasNum = true;
			}
		}
		if(wasNum)
		{
			output += " ";
		}
		while (operators.size() != 0)
		{
			output += operators.pop() + " ";
		}
		return output;
	}

	public double evaluateEquation(double val)
	{
		tempInfixString = infixString.replaceAll("x", Double.toString(val));
		return this.evaluateEquation();
	}

	public double evaluateEquation()
	{
		String[] infixArray = tempInfixString.split(" ");

		Stack<Double> operands = new Stack<Double>();
		for (int i = 0; i < infixArray.length; i++)
		{
			String currentElem = infixArray[i];

			if (!(operatorValues.containsKey(currentElem.charAt(0)) && currentElem.length() == 1))
			{
				operands.push(Double.parseDouble(infixArray[i]));
			} else
			{
				double op1 = operands.pop();
				double op2 = operands.pop();
				switch (currentElem.charAt(0))
				{
					case '+':
					{
						operands.push(op2 + op1);
						break;
					}
					case '-':
					{
						operands.push(op2 - op1);
						break;
					}
					case '*':
					{
						operands.push(op2 * op1);
						break;
					}
					case '/':
					{
						operands.push(op2 / op1);
						break;
					}
					case '^':
					{
						operands.push(Math.pow(op2, op1));
						break;
					}
				}
			}
		}
		return operands.pop();
	}

	@Override
	public String toString()
	{
		return infixString;
	}
}
