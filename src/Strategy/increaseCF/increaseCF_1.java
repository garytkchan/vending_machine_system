package Strategy.increaseCF;
import DataStore.DataStore;
import DataStore.DS_1;


/********Strategy pattern ********/


//accumulate cf value into DS_1 action for VM_1
public class increaseCF_1 extends increaseCF{
    public increaseCF_1(DataStore data) {
        super(data);
    }

    @Override
    public void increaseCF() {
        DS_1 d = (DS_1) data;
        d.cf = d.cf + d.temp_v;
        System.out.println("Action:  IncreaseCF()");
		System.out.println("Cumulative Fund cf: " + d.cf);
    }
}
