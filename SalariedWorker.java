package worker;

public class SalariedWorker extends Worker {
	int workingWeeks;

	@Override
	public int pay() {
		
		salary=PERHOURSALARY*workingWeeks*40;
		return salary;
	}
	
	public SalariedWorker(String name, int workingWeeks) {
		this.name=name;
		this.workerType=this.getClass().getSimpleName();
		this.workingWeeks = workingWeeks;
		this.salary=pay();
		
		
	}

	@Override
	public String toString() {
		return "\n[ workerType=" + workerType + ", name=" + name + ", salary="
				+ salary + "]";
	}

}
