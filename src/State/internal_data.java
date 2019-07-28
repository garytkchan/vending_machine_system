package State;


/******** State Pattern(decentralized) ********/


//internal data store for the state class pattern
public class internal_data {

	public int k; // cups
	public int [] A = new int[]{0,0}; // additive selection
	
	
	// get number of cups
	public int getK() {
		return k;
	}
	
	// set number of cups
	public void setK(int k) {
		this.k = k;
	}
	
	// get additive selection
	public int[] getA() {
		return A;
	}
	
	// set additive selection
	public void setA(int a){
		
		if (A[a] == 0)
			A[a] = 1;
		else
			A[a] = 0;
	}
}
