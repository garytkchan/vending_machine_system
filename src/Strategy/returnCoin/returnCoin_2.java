package Strategy.returnCoin;
import DataStore.DataStore;
import DataStore.DS_2;

/********Strategy pattern ********/


//return cf value action for VM_2
public class returnCoin_2 extends returnCoin {
   
	public returnCoin_2(DataStore data) {
        super(data);
    }

    @Override
    public void returnCoin() {
     
    	DS_2 d = (DS_2) data;
        System.out.println("Action:  returnCoin");
		System.out.println("Return value of coins last inserted: " + d.temp_v);
		d.temp_v = 0;
    }
}
