package Strategy.zeroCF;
import DataStore.DataStore;
import DataStore.DS_1;

/********Strategy pattern ********/


//zero CF action for VM_1
public class zeroCF_1 extends zeroCF {
    public zeroCF_1(DataStore data) {
        super(data);
    }

    @Override
    public void zeroCF() {
        DS_1 d = (DS_1) data;
        d.cf = 0;
        System.out.println("Action:  zero Cumulative Fund cf. Coin = " + d.cf);
    }
}
