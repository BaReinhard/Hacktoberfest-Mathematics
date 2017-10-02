import java.util.ArrayList;
import java.util.Arrays;

public class Equation
{
	
	ArrayList<String> equation;
	
	public Equation(String eq)
	{
		parseEquation(eq);
	}
	
	
	private void parseEquation(String eq)
	{
		eq = eq.replaceAll(" ", "");
		String[] eqAsArray = eq.split("(?=\\+|-)");
		equation = new ArrayList<String>(Arrays.asList(eqAsArray));
	}
	
	public double evaluateElement(int index, double num)
	{
		String elem = equation.get(index);
		int sign = 1;
		if(elem.charAt(0) == '-')
		{
			sign = -1;
		}
		
		String[] elemAsArray = elem.split("(?<=\\*|\\^)|(?=\\*|\\^)");
		for(int i = 0; i < elemAsArray.length; i++)
		{
			
			if(elemAsArray[i].equals("x"))
			{
				
			}
		}
		
		return num;
		
	}
	
	@Override
	public String toString()
	{
		String ans = "";
		for(String element : equation)
		{
			ans += element;
		}
		return ans;
	}
}
