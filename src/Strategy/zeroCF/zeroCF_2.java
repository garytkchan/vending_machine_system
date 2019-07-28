package Strategy.zeroCF;
import DataStore.DataStore;
import DataStore.DS_2;

/********Strategy pattern ********/


//zero CF action for VM_2
public class zeroCF_2 extends zeroCF {
    public zeroCF_2(DataStore data) {
        super(data);
    }

    @Override
    public void zeroCF() {
    	
        DS_2 d = (DS_2) data;
        d.cf = 0;
        System.out.println("Action:  zero Cumulative Fund cf. Coin = " + d.cf);
    }
}
