package MyHW;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {


    public Worker(String surName, String name, int age, int hourlyRate) {
        super(surName, name, age, hourlyRate);
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * 20.8 * 8;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата: %.2f руб., возраст %d",
                surName, name, calculateSalary(), age);
    }
}
