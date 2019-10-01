public class GaussianSums
{
	//sum all integers from start to end, inclusive
	public int sumRange(int start, int end)
	{
		int factor1 = start + end
		int factor2 = (end - start) / 2
		return factor1 * factor2;
	}
	
	//sum all integers from 0 to end, inclusive
	public int sumUpTo(int end)
	{
		return end * (end / 2);
	}
}
