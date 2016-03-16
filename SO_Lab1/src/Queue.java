import java.util.ArrayList;

public class Queue {
	//this class simulate a queue
	//Aga created this class
	
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
	
	public boolean empty() {
		return queue.isEmpty();
	}
	
	public int size() {
		return queue.size();
	}
	
	public void viewProcesses() {
		for(Process process : queue)
		{
			System.out.printf("%s %d %s %d %s %d %n","Id: ", process.getId(),"Arrival Time: ", process.getAr(),"Burst Time: ", process.getBt());
		}
	}
	
}
