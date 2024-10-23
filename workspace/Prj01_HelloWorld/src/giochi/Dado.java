package giochi;

public class Dado {

	int facce = 6;
	
	public int lancia() {
		double casuale =  Math.random();
		
		return (int) (casuale * facce) + 1;
	}
	
}
