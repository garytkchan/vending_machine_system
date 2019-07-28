package abstract_factory;

import Strategy.disposeAdditive.disposeAdditive;
import Strategy.disposeDrink.disposeDrink;
import Strategy.increaseCF.increaseCF;
import Strategy.returnCoin.returnCoin;
import Strategy.storePrice.StorePrice;
import Strategy.zeroCF.zeroCF;
import DataStore.DataStore;


/********Abstract factory pattern  ********/

//abstract class(abstract factory pattern)
public abstract class abstract_factory {
    
    public abstract StorePrice getStorePrice();
    public abstract zeroCF getZeroCF();
    public abstract increaseCF getIncreaseCF();
    public abstract returnCoin getReturnCoin();
    public abstract disposeDrink getDisposeDrink();
    public abstract disposeAdditive getDisposeAdditive();
    public abstract DataStore getDataStore();
}
