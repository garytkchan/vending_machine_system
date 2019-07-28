package State;


/******** State Pattern(decentralized) ********/

//the start state in the state pattern. S = LS[0]
public class start extends State{
   
	start(MDA_EFSM m) {
        super(m);
    }

    @Override
    public void create() {
    	
    		md.changeState(1);
            md.getOutput().storePrice();
            System.out.println("State: no cups");
    }
    
    @Override
	public void coin(int v){
		
		System.out.println("State: start");
		System.out.println("Please create a VM first.");

	}
	
	@Override
	public void insert_cups(int n){
		
		System.out.println("State: start");
		System.out.println("Please create a VM first.");
	}
	
	@Override
	public void card(){
		
		System.out.println("State: start");
		System.out.println("Please create a VM first.");
		
	}
	
	@Override
	public void set_price(){
		
		System.out.println("State: start");
		System.out.println("Please create a VM first.");
		
	}
	
	@Override
	public void dispose_drink(int d){
		
		System.out.println("State: start");
		System.out.println("Please create a VM first.");
		
		
	}
	
	@Override
	public void additive(int a){
		
		System.out.println("State: start");
		System.out.println("Please create a VM first.");
		
	}
	
	@Override
	public void cancel() {
		System.out.println("Operation cancel is not allowed in this state.");
	}
}