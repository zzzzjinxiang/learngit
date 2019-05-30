public class Cyc{
	private volatile int i = 10;
	private volatile static int j = 10;

	public synchronized void Test(){

		for(int m = 0;m<j;m++){
			i=m;
			System.out.println(m);
		}
	}
}