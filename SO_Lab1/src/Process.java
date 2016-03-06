
public class Process {
	// this class will contain process values
	//Aga will create this class
	
	
	//ar = Arrival Time (czas zgloszenia) bt = Burst Time (dlugosc fazy procesora) id = Number (numer) hm = How much (ile wykonano) isDone (czy wykonane)
	private final int ar; 
	private final int bt;
	private final int id;
	private int hm;
	private boolean isDone;
	
	public Process(int ar, int bt, int id){
		this.ar = ar;
		this.bt = bt;
		this.id = id;
		this.hm = 0;
		isDone = false;
	}

	public int getHm() {
		return hm;
	}

	public int getAr() {
		return ar;
	}

	public int getBt() {
		return bt;
	}

	public int getId() {
		return id;
	}
	
	public void increase(int hm) {
		this.hm += hm;
	}
	
	public boolean isDone() {
		if (hm >= bt)
			isDone = true;
		
		return isDone;
	}
	
}
