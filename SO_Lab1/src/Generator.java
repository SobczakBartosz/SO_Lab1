import java.util.*;

public class Generator {
	// this class will generate tests of the algorithms
		//Bartek will create this class
	
	public Queue generuj(int maxAt, int maxBt, int amount)
	{
		Queue q = new Queue();
		
		Random rand = new Random();
		for(int i = 0; i < amount; i++)
		{
			q.add(new Process(rand.nextInt(maxAt), rand.nextInt(maxBt),i));
		}
		return q;
	}
	
	public Queue generujRosnaca(int amount)
	{
		Queue q = new Queue();
		
		for(int i = 0; i < amount; i++)
		{
			q.add(new Process(i, i+2 ,i));
		}
		return q;
	}
	
	public static void main(String[] args)
	{
		Generator gen = new Generator();
		Algorithms alg = new Algorithms();
		Random r = new Random();
		
		double avrWtFCFS = 0.0;
		double avrWtSJFnp = 0.0;
		double avrWtSJFp = 0.0;
		double avrWtRRs = 0.0;
		double avrWtRRl = 0.0;
		
		Queue[] tab = new Queue[50];
		
		for(int i = 0; i < 50; i++)
		{
			tab[i] = gen.generuj(r.nextInt(100)+1, r.nextInt(100)+1, 100);
			 avrWtFCFS += alg.FCFS(tab[i]);
			 avrWtSJFnp += alg.SJFnp(tab[i]);
			 avrWtSJFp += alg.SJFp(tab[i]);
			 avrWtRRs += alg.RR(tab[i], 5);
			 avrWtRRl += alg.RR(tab[i], 40);
		}
		
		avrWtFCFS /= 50;
		avrWtSJFnp /= 50;
		avrWtSJFp /= 50;
		avrWtRRs /= 50;
		avrWtRRl /=50;
		
		System.out.printf("%s %n %s %.2f %n %s %.2f %n %s %.2f %n %s %.2f %n %s %.2f %n","Average time for algorithms:", "FCFS: ", avrWtFCFS,"non-preemptive SJF: ",
				avrWtSJFnp,"preemptive SJF: ", avrWtSJFp,"Round Robin with short quantum time: ", avrWtRRs, "Round Robin with long quantum time: ",  avrWtRRl);
		

		
	}
}
