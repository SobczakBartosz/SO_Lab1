
public class Process {
	// this class will contain process values
	//Aga will create this class
	
	
	//at = Arrival Time (czas zgloszenia) bt = Burst Time (dlugosc fazy procesora) id = Number (numer) hm = How much (ile wykonano) isDone (czy wykonane)
	private final int at; 
	private final int bt;
	private final int id;
	private int hm;
	private boolean isDone;
	
	public Process(int at, int bt, int id){
		this.at = at;
		this.bt = bt;
		this.id = id;
		this.hm = 0;
		isDone = false;
	}

	public int getHm() {
		return hm;
	}

	public int getAt() {
		return at;
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
