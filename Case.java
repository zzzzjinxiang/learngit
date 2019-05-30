public class Case{
	private int m;
	public int cal(int i){
		if(i<2){
			return 1;
		}
		return i+cal(i-1);
	}
}