import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MethodInterface extends Remote
{
      String twoConcat(String a,String b) throws RemoteException;
      int checkSubString(String a,String b) throws RemoteException;
      String reverse(String a) throws RemoteException;
      int totalVovels(String a) throws RemoteException;
}

