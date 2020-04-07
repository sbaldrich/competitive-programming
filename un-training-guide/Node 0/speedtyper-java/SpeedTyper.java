public class SpeedTyper {

	public String lettersToPractice(String letters, int[] times) {
		int avg = times[0];
		String ans="";
		for(int i=1;i<times.length;i++)
			avg+=times[i] - times[i-1];
		avg/=letters.length();
		System.out.println(avg);
		if(times[0] > avg)
			ans+=letters.charAt(0);
		for(int i=1;i<times.length;i++)
			if(times[i] - times[i-1] > avg)
				ans+=letters.charAt(i);
		
		return ans;
	}

}
