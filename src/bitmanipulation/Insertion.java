package bitmanipulation;

public class Insertion {
	public static int insertBit(int N, int M, int i, int j) {
		for(int x = i; x<=j; x++) {
			N=clearBits(N,x);
		}
		M=M<<i;
		return N^M;
	}

	private static int clearBits(int N, int i) {
		int mask = ~(1<<i);
		return N&mask;
	}
}
