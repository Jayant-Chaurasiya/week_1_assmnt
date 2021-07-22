package worker;

public abstract class Worker {

	public String name;
	public int salary;
	public String workerType;
	final int PERDAYSALARY = 100;
	final int PERHOURSALARY = 10;

	public abstract int pay();
	
	
	public int getSalary()
	{
		return salary;
	}
}
