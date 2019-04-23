import java.io.*;
import java.util.Scanner;
 
class bully{
    static int n;
    static int pro[] = new int[100];
    static int sta[] = new int[100];
    static int co;
     
    public static void main(String args[])throws IOException
    {
        System.out.println("Enter the number of process");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
         
        int i,j,k,l,m;
         
        for(i=0;i<n;i++)
        {
            System.out.println("For process "+(i+1)+":");
            System.out.println("Status:");
            sta[i]=in.nextInt();
            System.out.println("Priority");
            pro[i] = in.nextInt();
        }
         
        System.out.println("Which process will initiate election?");
        int ele = in.nextInt();
         
        elect(ele);//4
        System.out.println("Final coordinator is "+co);
    }
     
    static void elect(int ele)
    {
        ele = ele-1;//3
        co = ele+1;//4
        for(int i=0;i<n;i++)//i0,i1
        {
            if(pro[ele]<pro[i])//if(pro[3]<pro[0])
            {
                System.out.println("Election message is sent from "+(ele+1)+" to "+(i+1));
                if(sta[i]==1)
                    elect(i+1);
            }
        }
    }
}
