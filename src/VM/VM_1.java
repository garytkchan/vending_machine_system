package VM;
import DataStore.DS_1;
import abstract_factory.abstract_factory;


/***** Input class VM_1 ****/


//input class for vending machine 1
public class VM_1 extends VM{
	
    public VM_1(abstract_factory af) {
        super(af);
    }

    public void create(int p) {
       
    	DS_1 d1 = (DS_1) this.ds;
        d1.temp_p = p;
        m.create();
    }

    public void coin(int v) {
        
    	DS_1 d1 = (DS_1) this.ds;
        d1.temp_v = v;
        
        if (d1.cf + v >= d1.price) {
            m.coin(1);
        }
        else {
            m.coin(0);
        }
    }

    public void card(float x) {
       
    	DS_1 d1 = (DS_1) this.ds;
        if (x >= d1.price) {
            m.card();
        }
        else
        	System.out.println("Not enough value in card");
    }

    public void sugar() {
        
    	m.additive(1);
    }

    public void tea() {
        
    	m.dispose_drink(1);
    }

    public void chocolate() {
        
    	m.dispose_drink(2);
    }

    public void insert_cups(int n) {
       
    	m.insert_cups(n);
    }

    public void set_price(int p) {
       
    	DS_1 d1 = (DS_1) this.ds;
        d1.temp_p = p;
        m.set_price();
    }

    public void cancel() {
       
    	m.cancel();
    }
}
