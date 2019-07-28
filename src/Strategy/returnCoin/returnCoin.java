package Strategy.returnCoin;
import DataStore.DataStore;

/********Strategy pattern ********/

//Abstract class for return coin action
public abstract class returnCoin {
   
	DataStore data;

    public returnCoin() {
    }

    public returnCoin(DataStore data) {
        this.data = data;
    }

    public abstract void returnCoin();
}
