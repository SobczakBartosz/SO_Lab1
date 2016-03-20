import java.util.Comparator;

public class ProcessComparator3 implements Comparator<Process>{
	
	@Override
	public int compare(Process process1, Process process2) {
		return ((process1.getBt()-process1.getHm()) - (process2.getBt()-process2.getHm()));
	}

}
