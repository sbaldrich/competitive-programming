
public class MultiRead {

	public int minCycles(String trace, int procs) {
		char[] c = trace.toCharArray();
		int n = c.length, ans = 0, r=0;
		for(int i=0;i<n;i++)
		{
			if(c[i] == 'R')
				r++;
			else
			{
				ans+=Math.ceil(r/(double)procs) + 1;
				r = 0;
			}
		}
		
		return ans+=Math.ceil(r/(double)procs); 
	}

}
