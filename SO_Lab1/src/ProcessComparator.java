import java.util.Comparator;

public class ProcessComparator implements Comparator<Process>{
	
	@Override
	public int compare(Process process1, Process process2) {
		return (process1.getAt() - process2.getAt());
	}

}
