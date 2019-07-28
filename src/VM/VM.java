package VM;
import DataStore.DataStore;
import Output.Output;
import State.MDA_EFSM;
import abstract_factory.abstract_factory;

/***** Abstract Input class  ****/


public abstract class VM {
   
    MDA_EFSM m;
    DataStore ds;

    VM(abstract_factory af) {
    	
    	this.m = new MDA_EFSM();
        this.ds = af.getDataStore();
        this.m.setOutput(new Output(af));
    }
}
