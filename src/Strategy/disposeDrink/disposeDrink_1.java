package Strategy.disposeDrink;
import DataStore.DataStore;
import DataStore.DS_1;

/********Strategy pattern ********/


//dispose drink for VM_1 action
public class disposeDrink_1 extends disposeDrink {
    
	@Override
	public void disposeDrink(int d){
		
		if (d == 1)
		System.out.println("Action:  Dispose a cup of tea");
		else if (d == 2)
		System.out.println("Action:  Dispose a cup of chocolate");
	}
}
