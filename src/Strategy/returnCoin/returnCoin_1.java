package Strategy.returnCoin;
import DataStore.DataStore;
import DataStore.DS_1;

/********Strategy pattern ********/


//return value of cf action for VM_1
public class returnCoin_1 extends returnCoin {
    
	public returnCoin_1(DataStore data) {
        super(data);
    }

    @Override
    public void returnCoin() {
        DS_1 d = (DS_1) data;
        System.out.println("Action:  returnCoin");
		System.out.println("Return value of coins last inserted: " + d.temp_v);
		d.temp_v = 0;
    }
}
