package Strategy.storePrice;
import DataStore.DataStore;
import DataStore.DS_1;


/********Strategy pattern ********/


//store price into DS_1 action for VM_1
public class storePrice_1 extends StorePrice {
    
	public storePrice_1(DataStore data) {
        super(data);
    }

    @Override
    public void storePrice() {
        DS_1 d = (DS_1) data;
        d.price = d.temp_p;
        System.out.println("Action: storePrice.");
		System.out.println("Price = " + d.price);
    }
}
