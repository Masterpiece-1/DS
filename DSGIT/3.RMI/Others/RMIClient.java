
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RMIClient 
{
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		String url="rmi://127.0.0.1/Server";
		MethodInterface obj =(MethodInterface) Naming.lookup(url);
		String a,b;
		System.out.println("Enter the first String");
		a=new  Scanner(System.in).nextLine();
		System.out.println("Enter the Second String");
		b=new  Scanner(System.in).nextLine();
		System.out.println("Final String is  "+obj.twoConcat(a, b));
		int result=obj.checkSubString(a, b);
		if(result==1)
			System.out.println("Substring");
		else
			System.out.println("NOT substring");
		System.out.println("Revese is "+obj.reverse(a));
		
		System.out.println("Total Vovels are   "+obj.totalVovels(a));
	}

}

