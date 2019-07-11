package pub;

public class ByTwos implements Series {

	int start;
	int val;
	int prev;
	
	public ByTwos() {
		start = 0;
		val = 0;
		prev = -2;
	}

	@Override
	public int getNext() {
		val += 2;
		return val;
	}

	@Override
	public void reset() {
		val = start;
		prev = start - 2;
	}

	@Override
	public void setStart(int x) {
		start = x;
		val = x;
		prev = x - 2;
	}
	
	int getPrevious() {
		return prev;
	}
	
	@Override
	public int[] getNextArray(int n) {
		int[] vals = new int[n];
		return vals;
	}
	
}
