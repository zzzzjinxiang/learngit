public class stackTake{
	private volatile int m =0;
	private lock lock;
	public int cal(){
		lock.lock();
		while(true){
			synchronized(this){
			int i = 12;
			int j = 13;
			}
			lock.unlock();
	}
		return i+j*i;
	}
}