public class ReversedSum {

	private int rev(int n)
	{
		int x = 0;
		while(n > 0)
		{
			x*=10;
			x+=n%10;
			n/=10;
		}
		return x;
	}
	public int getReversedSum(int x, int y) {
		return rev( rev(x) + rev(y));
	}

}
