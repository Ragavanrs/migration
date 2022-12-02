package java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Forfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp=new ArrayList<Employee>();
		Employee e1=new Employee("e1","rana","tech");
		Employee e2=new Employee("e2","nana","software");
		Employee e3=new Employee("e3","ragav","tech");
		Employee e4=new Employee("e4","ritz","tech");
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e1);
		emp.forEach(e->System.out.println(e));
		
		emp.stream().filter(e->e.getDepartment()=="tech").forEachOrdered(System.out::println);
		
		//System.out.println(i.hello());
		Stream<Employee> st= Stream.<Employee>builder().add(e1).build();
	System.out.println(st);
	Set<Employee> s=emp.stream().collect(Collectors.toSet());
	System.out.println();
	emp.stream().map(E->new Employee(E.getId(),E.getName(),E.getDepartment())).sorted(Comparator.comparing(Employee ::getName )).filter(e->e.getName().startsWith("r")).forEach(e->System.out.println(e));
	System.out.println();
	
	Inter m=(Employee y)->{
		
		System.out.println(y.getName());
		return null;
	};
	
	s.stream().forEach(System.out::println);
	emp.stream().forEach(e->m.hello(e));
	
	emp.stream().filter(e->e.getId().equals("e4")&& e.getDepartment().equals("tech")).forEach(System.out::println);
	}

}
