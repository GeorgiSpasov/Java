/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remoteclock;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Shadow
 */
public interface TimeServerInterface extends Remote {

    public static final String LOOKUPNAME = "TimeServerInterfaceImpl";

    public Time setupClock(String clockName) throws RemoteException;
}
