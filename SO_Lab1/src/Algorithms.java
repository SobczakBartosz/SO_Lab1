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
	
	// SJFnp - non-preemtive SJF algorithm, q - queue which contains elements which are ready to do
	public double SJFnp(Queue queue)
	{
		Queue cloneQueue = queue.clone();
		Queue q = new Queue();
		int size = cloneQueue.size();
		double wt = 0.0; 
		int ct = 0;
		int at = 0;
		int bt = 0;
		
		
		Collections.sort(cloneQueue.queue, new ProcessComparator());
		while(!cloneQueue.isEmpty())
		{
			for(int i = 0; i < cloneQueue.size() && cloneQueue.getProcess(i).getAt() <= ct; i++)
			{
				q.add(cloneQueue.getProcess(i));
				cloneQueue.deleteProcess(i);
			}
				
			
			Collections.sort(q.queue, new ProcessComparator2());
			
			if(!q.isEmpty())
			{
				at = q.getProcess(0).getAt();
				bt = q.getProcess(0).getBt();
				ct += bt;
				wt += (double)((ct-at)-bt);	
				q.deleteProcess(0);
			}
			else
				++ct;
		}
		
		double avrWt = wt/((double)size);
		return avrWt;
	}
	
	
	// SJFp - preemtive SJF algorithm
	public double SJFp(Queue queue)
	{
		Queue cloneQueue = queue.clone();
		Queue q = new Queue();
		int size = cloneQueue.size();
		double wt = 0.0; 
		int ct = 0;
		int at = 0;
		int bt = 0;
		
		
		Collections.sort(cloneQueue.queue, new ProcessComparator());
		while(!cloneQueue.isEmpty())
		{
			for(int i = 0; i < cloneQueue.size() && cloneQueue.getProcess(i).getAt() <= ct; i++)
			{
				q.add(cloneQueue.getProcess(i));
				cloneQueue.deleteProcess(i);
			}
				
			Collections.sort(q.queue, new ProcessComparator3());
			if(!q.isEmpty())
			{
				at = q.getProcess(0).getAt();
				bt = q.getProcess(0).getBt();
				q.getProcess(0).increase(1);
				++ct;
				
				if(q.getProcess(0).getHm() >= bt)
				{
					wt += (double)((ct-at)-bt);
					q.deleteProcess(0);
				}

			}
			else
				++ct;
		}
		
		double avrWt = wt/((double)size);
		return avrWt;
	}
	

	
	
}
