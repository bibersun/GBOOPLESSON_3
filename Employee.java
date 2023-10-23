package MyHW;


public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String surName;
//    protected Double salary;
    protected double hourlyRate;
    protected Integer age;


    @Override
    public int compareTo(Employee o) {//сортировка по фамилии и возрасту
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0) {
            return age.compareTo(o.age);
        }
        return surNameRes;
    }


    public Employee(String surName, String name, int age, int hourlyRate) {
        this.name = name;
        this.surName = surName;
//        this.salary = calculateSalary();
        this.age = age;
        this.hourlyRate = hourlyRate;
    }


    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, calculateSalary());
    }
}
