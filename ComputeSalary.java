package worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



public class ComputeSalary {

	public static void main(String[] args) {

		List<Worker> l1 = new ArrayList<Worker>();

		l1.add(new DailyWorker("Rahul", 25));
		l1.add(new DailyWorker("Rohan", 35));
		l1.add(new SalariedWorker("Ajay", 8));
		l1.add(new SalariedWorker("Vijay", 12));

		System.out.println(l1);
		System.out.println();
		System.out.println("After sorting by salary : ");
		Collections.sort(l1,new Comparator<Worker>() {

			@Override
			public int compare(Worker o1, Worker o2) {
				if(o1.getSalary()>o2.getSalary())
				return 1;
				else
					return -1;
			}
		});
		Iterator<Worker> i1= l1.iterator();
		while(i1.hasNext())
		{
			Worker temp=i1.next();
			System.out.println(temp);
		}
	}

}
