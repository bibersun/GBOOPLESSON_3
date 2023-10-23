package MyHW;


import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        var w = new Worker("Иванов", "Пётр", 33, 370);
        System.out.println(w);
        var f = new Freelancer("Иванов2", "Пётр2", 37, 700);
        System.out.println(f);
        System.out.println("*******************");

        Employee[] employees = EmployeeFabric.genEmpl(10);
        for (Employee employee : employees){
            System.out.println(employee);
        }
        System.out.println("**********************");
        System.out.println("Сортировка по фамилии и возрасту");
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("**********");
        System.out.println("Сортировка по зарплате");
        Arrays.sort(employees, new SalaryComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("**********");
        System.out.println("Сортировка по возрасту");
        Arrays.sort(employees, new AgeComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("**********");


//        Worker[] workers = EmployeeFabric.generateEmployees(15);
//        for (Worker worker : workers) {
//            System.out.println(worker);
//        }
//
//        System.out.println();
//        System.out.println("***");
//        System.out.println();
//
//        Arrays.sort(workers, new SalaryComparator());
//
//        for (Worker worker : workers) {
//            System.out.println(worker);
//        }

    }

}
