package remoteclock;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterWithRMIServer {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            TimeServerInterface timeServer = new TimeServerInterfaceImpl();
            registry.rebind(TimeServerInterface.LOOKUPNAME, timeServer);
            System.out.println("Time server was succefully registered!");
        } catch (RemoteException ex) {
            Logger.getLogger(RegisterWithRMIServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (true) {

        }
    }
}
