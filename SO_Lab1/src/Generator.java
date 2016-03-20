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
		Queue q1 = gen.generuj(4,12,30);
		Queue q2 = gen.generuj(12,40,30);
		Queue q3 = gen.generuj(7,9,30);
		Queue q4 = gen.generuj(7,7,30);
		Queue q5 = gen.generuj(10,20,30);
		Queue q6 = gen.generuj(20,10,30);
		Queue q7 = gen.generuj(15,17,30);
		Queue q8 = gen.generuj(10,14,30);
		Queue q9 = gen.generuj(10,19,30);
		Queue q10 = gen.generuj(20,14,30);
		Queue q11 = gen.generuj(18,28,100); 
		Queue q12 = gen.generuj(8,35,100);
		Queue q13 = gen.generuj(7,14,100);
		Queue q14 = gen.generuj(16,24,100);
		Queue q15 = gen.generuj(12,45,100);
		Queue q16 = gen.generuj(38,12,100); // ej a tamte komentr
		Queue q17 = gen.generuj(19,45,100);
		Queue q18 = gen.generuj(10,14,100);
		Queue q19 = gen.generuj(10,14,100);
		Queue q20 = gen.generuj(10,14,65);
		Queue q21 = gen.generuj(10,14,65);
		Queue q22 = gen.generuj(10,14,65);
		Queue q23 = gen.generuj(10,14,65);
		Queue q24 = gen.generuj(10,14,65);
		Queue q25 = gen.generuj(10,14,65);
		Queue q26 = gen.generuj(10,14,65);
		Queue q27 = gen.generuj(10,14,65);
		Queue q28 = gen.generuj(10,14,65);
		Queue q29 = gen.generuj(10,14,65);
		Queue q30 = gen.generuj(10,14,65);
		
		
		
		System.out.printf("%.2f %.2f %.2f %.2f %.2f %n", alg.FCFS(q1), alg.SJFnp(q1), alg.SJFp(q1), alg.RR(q1, 2),  alg.RR(q1, 15));
		System.out.printf("%.2f %.2f %.2f %.2f %.2f %n", alg.FCFS(q2), alg.SJFnp(q2), alg.SJFp(q2), alg.RR(q2, 2),  alg.RR(q2, 15));
		System.out.printf("%.2f %.2f %.2f %.2f %.2f %n", alg.FCFS(q3), alg.SJFnp(q3), alg.SJFp(q3), alg.RR(q1, 2),  alg.RR(q3, 15));
		System.out.printf("%.2f %.2f %.2f %.2f %.2f %n", alg.FCFS(q4), alg.SJFnp(q4), alg.SJFp(q4), alg.RR(q4, 2),  alg.RR(q4, 15));
		
	}
}
