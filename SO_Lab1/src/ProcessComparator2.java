import java.util.Comparator;

public class ProcessComparator2 implements Comparator<Process>{
	
	@Override
	public int compare(Process process1, Process process2) {
		return (process1.getBt() - process2.getBt());
	}

}
