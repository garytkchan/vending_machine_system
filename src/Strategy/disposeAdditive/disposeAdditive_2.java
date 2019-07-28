package Strategy.disposeAdditive;
import DataStore.DataStore;
import DataStore.DS_2;


/********Strategy pattern ********/


//dispose additive selection for VM_2 action
public class disposeAdditive_2 extends disposeAdditive{
    
    @Override
    public void disposeAdditive(int[] A) {
        
    	if (A[0] == 0 && A[1] == 0)
			System.out.println("Additive: not selected");
		else if (A[0] == 1 && A[1] == 1)
			System.out.println("Additive: with sugar and cream");
		else if (A[0] == 1 && A[1] == 0)
			System.out.println("Additive: with sugar");
		else if (A[0] == 0 && A[1] == 1)
			System.out.println("Additive: with cream");
    }
}
