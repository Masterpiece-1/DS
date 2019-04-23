import mpi.MPI;

public class ScatterGather
{
	public static void main(String args[])
	{
		MPI.Init(args);
		
		int rank=MPI.COMM_WORLD.Rank();
		
		int size=MPI.COMM_WORLD.Size();
		
		int root=0;
		
		int sendbuffer[]=null;
		
		sendbuffer=new int[size];
		
		if(rank==root)
		{
			sendbuffer[0]=10;
			sendbuffer[1]=20;
			sendbuffer[2]=30;
			sendbuffer[3]=40;
			
			System.out.println("Processor"+rank+"has data :");
			for(int i=0;i<size;i++)
			{
				System.out.print(sendbuffer[i]+" ");
			}
			System.out.println();
		}
		int recvbuff[]=new int[1];
		
		MPI.COMM_WORLD.Scatter(sendbuffer,0,1,MPI.INT,recvbuff,0,1,MPI.INT,root);
		
		System.out.println("Processor"+rank+"has data"+recvbuff[0]);
		
		System.out.println("Processor"+rank+"is doubling the data");
		recvbuff[0]=recvbuff[0]*2;
		
		
		MPI.COMM_WORLD.Gather(recvbuff, 0, 1, MPI.INT, sendbuffer, 0, 1, MPI.INT, root);
		
		if(rank==root)
		{
			System.out.println("Process 0 has data :");
			for(int i=0;i<4;i++)
			{
				System.out.print(sendbuffer[i]+" ");
			}
		}
		MPI.Finalize();
	}
}
