package Strategy.disposeDrink;
import DataStore.DataStore;
import DataStore.DS_2;

/********Strategy pattern ********/


//dispose drink for VM_2 action
public class disposeDrink_2 extends disposeDrink {

	@Override
    public void disposeDrink(int d) {

        if (d == 3)
    		System.out.println("Action:  Dispose a cup of coffee");
    }
}
