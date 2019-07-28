package Strategy.disposeAdditive;
import DataStore.DataStore;
import DataStore.DS_1;


/********Strategy pattern ********/


//dispose additive selection for VM_1 action
public class disposeAdditive_1 extends disposeAdditive{
   
    @Override
    public void disposeAdditive(int[] A) {
        
    	if (A[0] == 1)
			System.out.println("Additive: with sugar");
		else if (A[0] == 0 && A[1] == 0)
			System.out.println("Additive: not selected");
    }
}
