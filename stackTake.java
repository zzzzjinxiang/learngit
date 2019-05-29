public class stackTake{
	private volatile int m =0;
	public int cal(){
		synchronized(this){
		int i = 12;
		int j = 13;
		return i+j;
		}
	}
}