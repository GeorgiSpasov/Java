package remoteclock;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TimeServerInterfaceImpl extends UnicastRemoteObject implements TimeServerInterface {

    public TimeServerInterfaceImpl()throws RemoteException{
    }
    
    @Override
    public Time setupClock(String clockName)throws RemoteException {
        Time time = new Time();
        time.setCurrentTime();
        System.out.println("Clock setup finished for clock: " + clockName);
        return time;
    }

}
