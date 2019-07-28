package State;


/******** State Pattern(decentralized) ********/


//the coin_inserted state in the state pattern. S = LS[3]
public class coin_inserted extends State {
    coin_inserted(MDA_EFSM m) {
        super(m);
    }

    @Override
	public void coin(int f){  // valid operation
		
		md.getOutput().returnCoin();
		System.out.println("State: coin inserted");
	}
	
	@Override
	public void dispose_drink(int d){  // valid operation
		
		if (md.k > 1){
			md.getOutput().disposeDrink(d);
			md.getOutput().disposeAdditive(md.A);
			md.k = md.k - 1;
			md.getOutput().zeroCF();
			md.changeState(2);
			System.out.println("State: idle");
		}
		else if(md.k <= 1){
			md.getOutput().disposeDrink(d);
			md.getOutput().disposeAdditive(md.A);
			md.changeState(1);
			System.out.println("State: no cups");
		}
		
		for (int i = 0; i < md.A.length; i++){
			md.A[i] = 0;
		}
	}
	
	@Override
	public void additive(int a){  // valid operation
		
		if (a == 1){ // select sugar
			if (md.A[0] == 0){
				md.A[0] = 1;
			}
			else if (md.A[0] == 1){
				md.A[0] = 0;
			}
		}
		if (a == 2){ // select cream
			if (md.A[1] == 0){
				md.A[1] = 1;
			}
			else if (md.A[1] == 1){
				md.A[1] = 0;
			}
		}
		
		md.getOutput().disposeAdditive(md.A);
		
		System.out.println("State: coin inserted");
	}
	
	@Override
	public void cancel(){  // valid operation
		
		md.getOutput().returnCoin();
		md.getOutput().zeroCF();
		for (int i = 0; i < md.A.length; i++)
			md.A[i] = 0;
		md.changeState(2);
		System.out.println("State: idle");
	}
	
	@Override
	public void create() {
		
		System.out.println("A VM is already created.");
		System.out.println("State: coin inserted");
	}
	
	@Override
	public void insert_cups(int n){
	
		System.out.println("Cannot insert cups in this state.");
		System.out.println("State: coin inserted");
	}
	
	@Override	
	public void card(){
		
		System.out.println("A card payment is already made");
		System.out.println("State: coin inserted");
		
	}
	
	@Override
	public void set_price(){
		
		System.out.println("Cannot set price in this state");
		System.out.println("State: coin inserted");
		
	}	
}
