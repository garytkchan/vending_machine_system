package Strategy.increaseCF;
import DataStore.DataStore;
import DataStore.DS_1;
import DataStore.DS_2;


/********Strategy pattern ********/


//accumulate cf value into DS_2 action for VM_2
public class increaseCF_2 extends increaseCF{
    public increaseCF_2(DataStore data) {
        super(data);
    }

    @Override
    public void increaseCF() {
        DS_2 d = (DS_2) data;
        d.cf = d.cf + d.temp_v;
        System.out.println("Action:  IncreaseCF()");
		System.out.println("Cumulative Fund cf: " + d.cf);
    }
}
