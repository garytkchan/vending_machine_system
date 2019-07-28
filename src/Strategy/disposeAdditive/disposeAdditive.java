package Strategy.disposeAdditive;
import DataStore.DataStore;


/********Strategy pattern ********/

//Abstract class for dispose additive action
public abstract class disposeAdditive {
    
	DataStore data;

    public abstract void disposeAdditive(int[] A);
}
