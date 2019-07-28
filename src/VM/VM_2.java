package VM;
import DataStore.DS_2;
import abstract_factory.abstract_factory;


/***** Input class VM_2 ****/


//input class for vending machine 2
public class VM_2 extends VM {
	
    public VM_2(abstract_factory af) {
        super(af);
    }

    public void CREATE(float p) {
       
    	DS_2 d2 = (DS_2) this.ds;
        d2.temp_p = p;
        m.create();
    }

    public void COIN(float v) {
        
    	DS_2 d2 = (DS_2) this.ds;
        d2.temp_v = v;

        if (d2.cf + v >= d2.price) {
            m.coin(1);
        }
        else {
            m.coin(0);
        }
    }

    public void SUGAR() {
        m.additive(1);
    }

    public void CREAM() {
        m.additive(2);
    }

    public void COFFEE() {
        m.dispose_drink(3);
    }

    public void insertCups(int n) {
        
    	m.insert_cups(n);
    }

    public void setPrice(float p) {
        
    	DS_2 d2 = (DS_2) this.ds;
        d2.temp_p = p;
        m.set_price();
    }

    public void CANCEL() {
        
    	m.cancel();
    }
}
