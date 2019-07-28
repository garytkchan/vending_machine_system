package Strategy.increaseCF;
import DataStore.DataStore;

/********Strategy pattern ********/

//Abstract class for accumulate cf action
public abstract class increaseCF {
    
	DataStore data;

    public increaseCF() {

    }

    public increaseCF(DataStore data) {
        this.data = data;
    }

    public abstract void increaseCF();
}
