package Strategy.storePrice;
import DataStore.DataStore;
import DataStore.DS_2;

/********Strategy pattern ********/


//store price into DS_2 action for VM_2
public class storePrice_2 extends StorePrice {
    public storePrice_2(DataStore data) {
        super(data);
    }

    @Override
    public void storePrice() {
        DS_2 d = (DS_2) data;
        d.price = d.temp_p;
        System.out.println("Action: storePrice.");
		System.out.println("Price = " + d.price);
    }
}
