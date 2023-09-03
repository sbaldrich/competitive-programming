import java.io.*;
import java.util.*;


class Main {
	static final PrintWriter out = new PrintWriter(System.out);

	static class ContestInputReader {
		BufferedReader reader;
		StringTokenizer tokenizer;

		ContestInputReader(Reader reader) {
			this.reader = new BufferedReader(reader);
		}

		ContestInputReader(){
			this(new InputStreamReader(System.in));
		}

		public static ContestInputReader get(String file){
			if("true".equalsIgnoreCase(System.getProperty("nojudge"))){
				try {
					return new ContestInputReader(new FileReader(file));
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return new ContestInputReader();
		}

		String readLine(){
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException("Couldn't read anything", e);
			}
		}

		String next(){
			while(tokenizer == null || ! tokenizer.hasMoreElements()){
				tokenizer = new StringTokenizer(readLine());
			}
			return tokenizer.nextToken();
		}

		int nextInt(){
			return Integer.parseInt(next());
		}

		int[] nextIntArray(){
			return Arrays.stream(readLine().split("\\s+"))
						.mapToInt(Integer::parseInt)
						.toArray();
		}
	}

	public static void main(String[] args){
		ContestInputReader reader = new ContestInputReader();
		int c = reader.nextInt();
		while(c --> 0){
			char[] S = reader.readLine().toCharArray();
			StringBuilder ans = new StringBuilder();
			ans.append(S[0]);
			for(int i = 2; i < S.length; i += 2)
				ans.append(S[i]);
			ans.append(S[S.length - 1]);
			out.println(ans);
		} 

		out.close();
	}
}
