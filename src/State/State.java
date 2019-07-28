package State;


/******** State Pattern(decentralized) ********/

//abstract state class of the decentralized state pattern
public abstract class State {
    
	MDA_EFSM md;

    public State(MDA_EFSM m) {
        this.md = m;
    }
    
    // abstract create
    void create() {

    }
    
    // abstract insert_cups
    void insert_cups(int n) {

    }

    // abstract coin
    void coin(int f) {

    }
    
    // abstract card
    public void card(){
		
	}
    
    // abstract cancel
    void cancel() {

    }
    // abstract set_price
    void set_price() {

    }

    void dispose_drink(int d) {

    }

    void additive(int a) {

    }
}
