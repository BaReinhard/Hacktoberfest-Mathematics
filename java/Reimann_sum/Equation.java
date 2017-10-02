import java.util.HashMap;
import java.util.Stack;

public class Equation
{

	private String infixString;
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
		System.out.println(infixString);

	}

	private String convertToInfix(String eq)
	{
		String output = "";
		eq = eq.replaceAll(" ", "");
		Stack<Character> operators = new Stack<Character>();
		for (int i = 0; i < eq.length(); i++)
		{
			System.out.println(output + "\t" + operators);
			char currentChar = eq.charAt(i);
			if (operatorValues.containsKey(currentChar))
			{
				while ((operators.size() != 0 && operators.peek() != '(')
						&& (operatorValues.get(currentChar) <= operatorValues.get(operators.peek())
								&& operatorValues.get(currentChar) != 2))
				{
					output += operators.pop();
				}
				operators.push(currentChar);
			} else if (currentChar == '(')
			{
				operators.push(currentChar);
			} else if (currentChar == ')')
			{
				while (operators.size() != 0 && operators.peek() != '(')
				{
					output += operators.pop();
				}
				operators.pop();
			} else
			{
				output += currentChar;
			}
		}
		while(operators.size() != 0)
		{
			output += operators.pop();
		}
		return output;
	}
	
	public void evaluteEquation()
	{
		
	}

	@Override
	public String toString()
	{
		return infixString;
	}
}
