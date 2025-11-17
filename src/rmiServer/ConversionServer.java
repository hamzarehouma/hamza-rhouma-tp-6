package rmiServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiService.ConversionImpl;
import rmiService.IConversion;
    
public class ConversionServer {

    public static void main(String[] args) {
        try {
            // i. Activer l'annuaire RMIRegistry sur le port 1099
            LocateRegistry.createRegistry(1099);
            System.out.println("RMI Registry démarré sur le port 1099...");

            // ii. Créer une instance de ConversionImpl
            IConversion conversion = new ConversionImpl();

            // iii. Publier l'objet dans l'annuaire sous le nom "conversionService"
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("conversionService", conversion);

            System.out.println("Service Conversion enregistré et prêt !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
