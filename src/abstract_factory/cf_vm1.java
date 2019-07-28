package abstract_factory;

import Strategy.increaseCF.increaseCF;
import Strategy.increaseCF.increaseCF_1;
import Strategy.returnCoin.returnCoin;
import Strategy.returnCoin.returnCoin_1;
import Strategy.storePrice.StorePrice;
import Strategy.storePrice.storePrice_1;
import Strategy.zeroCF.zeroCF;
import Strategy.zeroCF.zeroCF_1;
import Strategy.disposeAdditive.disposeAdditive;
import Strategy.disposeAdditive.disposeAdditive_1;
import Strategy.disposeDrink.disposeDrink;
import Strategy.disposeDrink.disposeDrink_1;
import DataStore.DataStore;
import DataStore.DS_1;

/********Abstract factory pattern  ********/


//Concrete factory class for VM_1 under the abstract factory pattern
public class cf_vm1 extends abstract_factory{
   
	private DataStore ds;

    public cf_vm1() {
        
    	this.ds = new DS_1();
    }

    @Override
    public DataStore getDataStore() {
        
    	return this.ds;
    }

    @Override
    public StorePrice getStorePrice() {
        
    	return new storePrice_1(this.ds);
    }

    @Override
    public zeroCF getZeroCF() {
        
    	return new zeroCF_1(this.ds);
    }

    @Override
    public disposeAdditive getDisposeAdditive() {
        
    	return new disposeAdditive_1();
    }

    @Override
    public disposeDrink getDisposeDrink() {
        
    	return new disposeDrink_1();
    }

    @Override
    public increaseCF getIncreaseCF() {
        
    	return new increaseCF_1(this.ds);
    }

    @Override
    public returnCoin getReturnCoin() {
        
    	return new returnCoin_1(this.ds);
    }
}
