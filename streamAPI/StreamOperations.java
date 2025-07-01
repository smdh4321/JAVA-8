package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {
        //Collection to stream
        //Array of value to stream
        //from stream.of() method
        List<Employee> employees = employeeList();
//        get all emp names
        List<String> names = new ArrayList<>();
        for(Employee e : employees){
            names.add(e.getName());
        }
        System.out.println(names);
        System.out.println("----------------------------------------------------------------");


//        get all emp names using stream

        List<String> empNames=employees.stream()
                .filter(emp -> emp.getName().contains("a"))
                .map(emp -> emp.getName()).toList();
        System.out.println(empNames);
        System.out.println("----------------------------------------------------------------");


//        get all employees whose age is > 30

        List<String> empNamesAgeG30=employees.stream()
                .filter(emp -> emp.getAge() > 30)
                .map(emp -> emp.getName()).toList();
        System.out.println(empNamesAgeG30);
        System.out.println("----------------------------------------------------------------");


//        print all unique cities of employees

        List<String> cityNames=employees.stream()
                .map(emp -> emp.getCity())
                .distinct()
                .toList();
        System.out.println(cityNames);
        System.out.println("----------------------------------------------------------------");


//        get count of employees whose sal is > 65000
        Long count=employees.stream()
                .filter(emp -> emp.getSalary() > 65000)
                .count();
        System.out.println(count);
        System.out.println("----------------------------------------------------------------");


//        get first three employee objects

        employees.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");

//        skip first three employee objects

        employees.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");


//        find first employee
        Employee e=employees.stream().findFirst().get();
        System.out.println(e);

//        get employee id's in sorted order

        List<Integer> sortedEmpById=employees.stream()
                .map(emp -> emp.getId())
                .sorted()
                .toList();
        System.out.println(sortedEmpById);

        System.out.println("----------------------------------------------------------------");
//        get employee details according to ascending order os Id

        employees.stream()
                .sorted((o1,o2)->o1.getId() < o2.getId() ? -1 : 1)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");

//        min sal employee details
        Employee e2=employees.stream()
                .sorted((o1,o2)->o1.getSalary() < o2.getSalary() ? -1 : 1)
                .findFirst()
                .get();
        System.out.println(e2);

        System.out.println("----------------------------------------------------------------");

        //        max sal employee details
        Employee e3=employees.stream()
                .sorted((o1,o2)->o1.getSalary() < o2.getSalary() ? 1 : -1)
                .findFirst()
                .get();
        System.out.println(e3);
        System.out.println("----------------------------------------------------------------");

//        get second highest salary employee details
        employees.stream()
                .sorted((emp1,emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary()))
                .skip(1)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------------------------");
        
//        get average salary

        Double avg=employees.stream()
                .mapToDouble(emp -> emp.getSalary())
                .average().getAsDouble();
        System.out.println(avg);
        System.out.println("----------------------------------------------------------------");


//        get unique departments

        List<String> uniqueDept=employees.stream()
                .map(emp -> emp.getDepartment())
                .distinct()
                .toList();
        System.out.println(uniqueDept);
        System.out.println("----------------------------------------------------------------");
//        get unique departments without using distinct() method
        Set<String> uniqueDept2=employees.stream()
                .map(emp -> emp.getDepartment())
                .collect(Collectors.toSet());
        System.out.println(uniqueDept2);
        System.out.println("----------------------------------------------------------------");

//        collect employee IDs and their salaries
        Map<Integer,Double> idAndSal=employees.stream()
                .collect(Collectors.toMap(Employee::getId,Employee::getSalary));

        System.out.println(idAndSal);
        System.out.println("----------------------------------------------------------------");

//        get avg sal of each dept
        Map<String, Double> avgSalDeptWise = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println(avgSalDeptWise);
        System.out.println("----------------------------------------------------------------");

//        get count of employees gender wise
        Map<String,Long> countOfEmpGenderWise=employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.counting()
                ));
        System.out.println(countOfEmpGenderWise);
        System.out.println("----------------------------------------------------------------");


//        summing
//        summarizing
//        get the sum of salaries of all employees using summing
        System.out.println(employees.stream()
                .collect(Collectors.summingDouble(Employee::getSalary)));
        System.out.println("----------------------------------------------------------------");

//        get the sum of salaries of all employees using summarizing
//        summarizing gives all statistics like (count,sum, min, max,avg)
        System.out.println(employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary)));
        System.out.println("----------------------------------------------------------------");

//        get max age employee details
        Employee maxAgeEmp=employees.stream()
                .max(((o1, o2) -> o1.getAge() - o2.getAge()))
                .get();
        System.out.println(maxAgeEmp);
        System.out.println("----------------------------------------------------------------");

//        get min age employee details
        Employee minAgeEmp=employees.stream()
                .min(((o1, o2) -> o1.getAge() - o2.getAge()))
                .get();
        System.out.println(minAgeEmp);
        System.out.println("----------------------------------------------------------------");

    }


    public static List<Employee> employeeList(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(6, "Alice", "Bangalore", 28, "Female", "IT", 2019, 85000));
        employees.add(new Employee(7, "Bob", "Hyderabad", 32, "Male", "HR", 2018, 60000));
        employees.add(new Employee(3, "Charlie", "Delhi", 29, "Male", "Finance", 2020, 75000));
        employees.add(new Employee(8, "Diana", "Mumbai", 26, "Female", "Marketing", 2021, 70000));
        employees.add(new Employee(9, "Ethan", "Chennai", 31, "Male", "IT", 2017, 95000));
        employees.add(new Employee(10, "Fiona", "Pune", 27, "Female", "Sales", 2022, 68000));
        employees.add(new Employee(2, "George", "Kolkata", 34, "Male", "HR", 2016, 62000));
        employees.add(new Employee(4, "Hannah", "Ahmedabad", 30, "Female", "Finance", 2015, 79000));
        employees.add(new Employee(5, "Ian", "Bangalore", 25, "Male", "Marketing", 2023, 55000));
        employees.add(new Employee(1, "Julia", "Hyderabad", 33, "Female", "IT", 2014, 100000));
        return employees;
    }
}
