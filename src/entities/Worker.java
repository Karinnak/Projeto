package entities;
import java.util.List;

import entities.enums.WorkerLevel1;

public class Worker {
	
	private String name;
	private WorkerLevel1 level ;
	private Double baseSalary;
	
	
	private Department department;
	private List<HourContract> contracts;
	
	public Worker() {
		
		
	}
	
	

}
