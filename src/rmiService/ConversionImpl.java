package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion {

    // Constructeur obligatoire qui doit lever RemoteException
    public ConversionImpl() throws RemoteException {
        super();
    }

    @Override
    public double convertirMontant(double mt) throws RemoteException {
        // Exemple simple : convertir d'euros vers dinars (ex : 1€ = 3.3 TND)
        return mt * 3.3;
    }
}
