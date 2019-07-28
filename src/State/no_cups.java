package State;


/******** State Pattern(decentralized) ********/


//the no cups state in the state pattern. S = LS[1]
public class no_cups extends State {
    
	no_cups(MDA_EFSM m) {
        super(m);
    }

    @Override
    void coin(int f) {
        md.getOutput().returnCoin();
        System.out.println("State: no cups");
    }

    @Override
    void insert_cups(int n) {
        if (n > 0) {
        	md.k = n;
        	System.out.println("Cups inserted: " + md.k);
            md.getOutput().zeroCF();
            md.changeState(2);
            System.out.println("State: idle");	
            }
    	}
    
    @Override
	public void create() {
		
		System.out.println("A VM is already created.");
		System.out.println("State: no cups");
	}
    
    @Override
	public void card(){
		
		System.out.println("Unable to take card. No cups in machine.");
		System.out.println("State: no cups");
	}
	
	@Override
	public void set_price(){
		
		System.out.println("Unable to set price. No cups in machine.");
		System.out.println("State: no cups");
		
	}
	
	@Override
	public void dispose_drink(int d){
		
		System.out.println("Unable to dispose drink. No cups in machine.");
		System.out.println("State: no cups");
		
	}
	
	@Override
	public void additive(int a){
		
		System.out.println("Unable to select additive. No cups in machine.");
		System.out.println("State: no cups");
	}
	
	@Override
	public void cancel(){
		
		System.out.println("No order to be canceled.");
		System.out.println("State: no cups");
		
	}
    
}
