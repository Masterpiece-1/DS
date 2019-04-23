
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MethodImplem extends  UnicastRemoteObject implements MethodInterface{

	protected MethodImplem() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String twoConcat(String a, String b) {
		// TODO Auto-generated method stub
		return a.concat(b);
	}

	@Override
	public int checkSubString(String a, String b) throws RemoteException {
		if(a.contains(b))
		return 1;
	return 0;
	}
	@Override
	public String reverse(String a) throws RemoteException {
		return new StringBuilder(a).reverse().toString();
	}
	 public int totalVovels(String a) throws RemoteException {
	int total=0;
	for (int i = 0; i < a.length(); i++) 
	{
		if(a.charAt(i)=='a'  ||a.charAt(i)=='e'  ||a.charAt(i)=='i'  ||a.charAt(i)=='o'  ||a.charAt(i)=='u')
			total++;
	
	}
	return total;
}


}

