package remoteclock;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimeClient extends javax.swing.JFrame {

    private Clock clock;
    private TimeServerInterface remoteTime;
    private final int UID;

    public TimeClient(int UID) {
        // Setup clock panel
        clock = new Clock();
        add(clock);
        this.UID = UID;
        String clockTitle = String.format("Clock № %d", UID);
        setTitle(clockTitle);
        // Setup remote
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            remoteTime = (TimeServerInterface) registry.lookup(TimeServerInterface.LOOKUPNAME);
            Time localTime = remoteTime.setupClock(clockTitle);
            int timeZone = new Random().nextInt(13 + 1 + 12) - 12;
            localTime.setHour(localTime.getHour() + timeZone);
            localTime.setTimeZone(timeZone);
            clock.setClock(localTime);
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(TimeClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        TimeClient timeClients[] = new TimeClient[4];
        for (int i = 1; i <= timeClients.length; i++) {
            TimeClient t = new TimeClient(i);
            t.setSize(220, 120);
            t.setVisible(true);
            t.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }
}
