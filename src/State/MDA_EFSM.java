package State;
import Output.Output;
import State.State;



/********MDA-EFSM Class  ********/


public class MDA_EFSM {
    State s;
    State[] ls = new State[4];
    private  Output op;
    int k;
    public int [] A = new int[]{0,0};

    public MDA_EFSM() {
    	// different states
    	ls[0] = new start(this);  
    	ls[1] = new no_cups(this);  
    	ls[2] = new idle(this);
    	ls[3] = new coin_inserted(this);
    	s = ls[0];
    }

    public void create() {
        s.create();
    }

    public void insert_cups(int n) {
        s.insert_cups(n);
    }

    public void coin(int f) {
        s.coin(f);
    }
    
    public void card(){
    	s.card();
    }

    public void cancel() {
        s.cancel();
    }

    public void set_price() {
        s.set_price();
    }

    public void dispose_drink(int d) {
        s.dispose_drink(d);
    }

    public void additive(int a) {
        s.additive(a);
    }
    
    public Output getOutput() {
        return op;
    }

    public void setOutput(Output op) {
        this.op = op;
    }
    
public void changeState(int id){
		
		s = ls[id];
	}
}
