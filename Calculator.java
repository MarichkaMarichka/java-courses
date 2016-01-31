public class Calculator{
	private int result;
	public void add(int ... params){
		for(Integer param : params)
			this.result += param;
	}
	
	public void exponent(int param, int degree){
			this.result = 0;//Math.pow(param,degree);
	}
	public int getResult(){
		return this.result;
	}
	public void cleanResult(){
		this.result = 0 ;
	}
}