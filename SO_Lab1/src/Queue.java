import java.util.ArrayList;

public class Queue {
	//this class simulate a queue
	//Aga create this class
	
	ArrayList<Process> queue = new ArrayList<Process>();

	public Process getProcess(int index) {
		return queue.get(index);
	}

	public void setProcess(int index, Process process) {
		queue.set(index, process);
	}
	
	public void add(Process process) {
		queue.add(process);
	}
	
	public void add(int index, Process process) {
		queue.add(index, process);
	}
	
	public void deleteProcess(int index) {
		queue.remove(index);
	}
	
	public boolean isEmpty() { 
		return queue.isEmpty();
	}
	
	public void clear() {
		queue.clear();
	}
	
	public int size() {
		return queue.size();
	}
	
	public Queue clone() {
		Queue cloneQueue = new Queue();
			for(int i = 0; i < queue.size(); i++)
				cloneQueue.add(queue.get(i));
			return cloneQueue;
	}
	
	
	public void viewProcesses() {
		for(Process process : queue)
		{
			System.out.printf("%s %d %s %d %s %d %n","Id: ", process.getId(),"Arrival Time: ", process.getAt(),"Burst Time: ", process.getBt());
		}
	}
	
}
