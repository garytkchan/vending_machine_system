package Output;

import Strategy.disposeAdditive.disposeAdditive;
import Strategy.disposeDrink.disposeDrink;
import Strategy.increaseCF.increaseCF;
import Strategy.returnCoin.returnCoin;
import Strategy.storePrice.StorePrice;
import Strategy.zeroCF.zeroCF;
import abstract_factory.abstract_factory;

/********Strategy pattern output class  ********/

// output class to call for actions
public class Output {
	
    private increaseCF increaseCF;
    private returnCoin returnCoin;
    private disposeDrink disposeDrink;
    private disposeAdditive disposeAdditive;
    private StorePrice storePrice;
    private zeroCF zeroCF;

    
    public Output(abstract_factory af) {
    	
        this.increaseCF = af.getIncreaseCF();
        this.returnCoin = af.getReturnCoin();
        this.disposeDrink = af.getDisposeDrink();
        this.disposeAdditive = af.getDisposeAdditive();
        this.storePrice = af.getStorePrice();
        this.zeroCF = af.getZeroCF();
    }

    public void increaseCF() {
        this.increaseCF.increaseCF();
    }

    public void returnCoin() {
    	
        this.returnCoin.returnCoin();
    }

    public void disposeDrink(int d) {
    	
        this.disposeDrink.disposeDrink(d);
    }

    public void disposeAdditive(int[] A) {
        this.disposeAdditive.disposeAdditive(A);
    }
    
    public void storePrice() {
        this.storePrice.storePrice();
    }

    public void zeroCF() {
        this.zeroCF.zeroCF();
    }
}
