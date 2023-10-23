package MyHW;

public class Freelancer extends Employee{

    public Freelancer(String surName, String name, int age, int hourlyRate) {
        super(surName, name, age, hourlyRate);
    }

        @Override
    public double calculateSalary() {
            return hourlyRate * 20.8 * 8;

    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; заработная плата: %.2f руб. в месяц, возраст %d",
                surName, name, calculateSalary(), age);
    }

}

