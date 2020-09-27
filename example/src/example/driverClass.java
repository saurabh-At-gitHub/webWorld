package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class driverClass {

	public static void main(String[] args) {
		
		
//		Employee emp1 = new Employee(1,"ramesh",20000);
//		Employee emp2 = new Employee(2,"manoj",25000);
//		Employee emp3 = new Employee(3,"rakesh",19200);
//		Employee emp4 = new Employee(4,"binod",19200);
//		Employee emp5 = new Employee(5,"rakesh",25000);
//		Employee emp6 = new Employee(6,"arjun",30000);
		
		Employee emp1 = new Employee("ramesh",20000);
		Employee emp2 = new Employee("manoj",25000);
		Employee emp3 = new Employee("rakesh",19200);
		Employee emp4 = new Employee("binod",19200);
		Employee emp5 = new Employee("rakesh",25000);
		Employee emp6 = new Employee("ramesh",30000);
		
		Map<Integer,Employee> empMap = new HashMap<>();
		
		empMap.put(1, emp1);
		empMap.put(2, emp2);
		empMap.put(3, emp3);
		empMap.put(4, emp4);
		empMap.put(5, emp5);
		empMap.put(6, emp6);
		
		System.out.println(empMap.get(1));
		int totalsalary=0;
		for(Entry<Integer, Employee> e : empMap.entrySet()) {
			Employee em = e.getValue();
			if(em.getEmpName().equals("ramesh")){
				totalsalary=totalsalary + em.getSalary();
			}
		}
		System.out.println("total salary of ramesh is" + totalsalary);
		
		
		Employee emp7 = new Employee(1,"ramesh",20000);
		System.out.println(emp1);
		System.out.println(emp7);
		if(emp1.equals(emp7)) {
			System.out.println(emp1);
			System.out.println(emp7);
			System.out.println("Both emp1 and emp7 are same employee");
		}
		
				int a[]= {1,2,3,4,5,6,7,8,9,10};
				printunorderedPairs(a);
				
	}
	
	static void printunorderedPairs(int[] array) {
		 for (int i = 0; i < array.length; i++) {
		 for (int j = i + 1; j < array.length ; j++) {
		// System.out.println (array[i] + "," + array[j]) ;
		 System.out.print("*");
		 }
		 System.out.println("");
		 
		 }
		 }

}
