package State;


/******** State Pattern(decentralized) ********/


//the idle state in the state pattern. S = LS[2]
public class idle extends State {
    idle(MDA_EFSM m) {
        super(m);
    }

    @Override
	public void insert_cups(int n){ // valid operation
		
		if (n > 0){
			md.k = md.k + n;
		System.out.println(md.k + " Cups inserted");
		}
		System.out.println("State: idle");
	}
	
	@Override
	public void coin(int f){  // valid operation
		
		if (f == 0){
			md.getOutput().increaseCF();
			System.out.println("State: idle");
		}
		else if(f == 1){
		md.changeState(3);
		md.getOutput().increaseCF();
		System.out.println("State: coins inserted");
		}
	}
	
	@Override
	public void card(){  // valid operation
		
		md.changeState(3);
		md.getOutput().zeroCF();
		System.out.println("State: coins inserted");
	}
	
	@Override
	public void set_price(){  // valid operation
		md.getOutput().storePrice();
		System.out.println("State: idle");
	}
	
	@Override
	public void create() {
		
		System.out.println("A VM is already created.");
		System.out.println("State: idle");
	}
	
	@Override
	public void dispose_drink(int d){
		
		System.out.println("Please make enough payment first.");
		System.out.println("State: idle");
	}
	
	@Override
	public void additive(int a){
		
		System.out.println("Please make enough payment first.");
		System.out.println("State: idle");
	}
	
	@Override
	public void cancel(){
		
		System.out.println("No order to be canceled.");
		System.out.println("State: idle");
	}
   
    

    
    

}
