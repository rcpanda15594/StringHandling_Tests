package core.nit.string.comapre_with_case;

public class Example {
	int x;
	
	Example(int x){
		this.x=x;
		
	}//con
	public boolean equals(Object obj) {
		if(obj instanceof Example) {
			Example e=(Example)obj;
			return(this.x==e.x);
		}
		return false;
	}//method

}//class
