package abstract_factory;

import Strategy.increaseCF.increaseCF;
import Strategy.increaseCF.increaseCF_2;
import Strategy.returnCoin.returnCoin;
import Strategy.returnCoin.returnCoin_2;
import Strategy.storePrice.StorePrice;
import Strategy.storePrice.storePrice_2;
import Strategy.zeroCF.zeroCF;
import Strategy.zeroCF.zeroCF_2;
import Strategy.disposeAdditive.disposeAdditive;
import Strategy.disposeAdditive.disposeAdditive_2;
import Strategy.disposeDrink.disposeDrink;
import Strategy.disposeDrink.disposeDrink_2;
import DataStore.DataStore;
import DataStore.DS_2;


/********Abstract factory pattern  ********/


//Concrete factory class for VM_2 under the abstract factory pattern
public class cf_vm2 extends abstract_factory{
    
	private DataStore ds;

    public cf_vm2() {
        this.ds = new DS_2();
    }

    @Override
    public DataStore getDataStore() {
        
    	return this.ds;
    }

    @Override
    public StorePrice getStorePrice() {
        
    	return new storePrice_2(this.ds);
    }

    @Override
    public zeroCF getZeroCF() {
        
    	return new zeroCF_2(this.ds);
    }

    @Override
    public disposeAdditive getDisposeAdditive() {
        
    	return new disposeAdditive_2();
    }

    @Override
    public disposeDrink getDisposeDrink() {
        
    	return new disposeDrink_2();
    }

    @Override
    public increaseCF getIncreaseCF() {
        
    	return new increaseCF_2(this.ds);
    }

    @Override
    public returnCoin getReturnCoin() {
        
    	return new returnCoin_2(this.ds);
    }
}
