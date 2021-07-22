package worker;

public class DailyWorker extends Worker {
	int workingDays;
	String workerType;

	@Override
	public int pay() {
		salary = PERDAYSALARY * workingDays;
		return salary;
	}

	public DailyWorker(String name, int workingDays) {
		this.name=name;
		this.workerType=this.getClass().getSimpleName();
		this.workingDays = workingDays;
		this.salary=pay();
		
		
	}

	@Override
	public String toString() {
		return "\n[ workerType=" + workerType + ", name=" + name + ", salary="
				+ salary + "]";
	}

	

}
