package Strategy.zeroCF;
import DataStore.DataStore;

/********Strategy pattern ********/

//Abstract class for zero CF action
public abstract class zeroCF {
    
	DataStore data;

    public zeroCF() {
    }

    public zeroCF(DataStore data) {
        this.data = data;
    }

    public abstract void zeroCF();
}
