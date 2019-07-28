package Strategy.storePrice;
import DataStore.DataStore;

/********Strategy pattern ********/

//Abstract class for store price action
public abstract class StorePrice {
   
	DataStore data;

    public StorePrice() {
    }

    public StorePrice(DataStore data) {
        this.data = data;
    }

    public abstract void storePrice();
}
