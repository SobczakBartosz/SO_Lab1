import java.util.*;

public class Algorithms {
	//this class will contain FCFS, SJF and RoundRobin algorithms
	//Aga will create FCFS Algorithm and Bartek will create SJF and RoundRobin algorithm
	
	
	// size - number of processes, ct - complition time, ct-at - turn around time, wt - waiting time, avrgWt - average waiting time
	public double FCFS(Queue queue)
	{
		Queue cloneQueue = queue.clone();
		double wt = 0.0;
		int size = cloneQueue.size();
		int ct = 0;
		int at = 0;
		int bt = 0;
		
			Collections.sort(cloneQueue.queue, new ProcessComparator());
		
			for(int i = 0; i < cloneQueue.size(); i++)
			{
				at = cloneQueue.getProcess(i).getAt();
				bt = cloneQueue.getProcess(i).getBt();
					if(at > ct)
						ct = at;
					ct += bt;
					wt += (double)((ct-at)-bt);					
			}	
				double avrgWt = wt/((double)size);
				
				return avrgWt;
	}
	
	// SJFnp - non-preemtive SJF algotihm
	public double SJFnp(Queue queue)
	{
		int ct = 0;
		
		double avrWt = 0.0;
		return avrWt;
	}
	
	

	
	
}
