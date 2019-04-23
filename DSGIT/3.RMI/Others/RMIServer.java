
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class RMIServer
{
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		MethodImplem obj = new MethodImplem();
		Naming.rebind("Server", obj);
	}
	
}
