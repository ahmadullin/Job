package ru.geekbrains.lesson3.task2;

// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания (+)
 */
public class Freelancer extends Employee{

    protected double time;

    public double getTime() {
        return time;
    }

    public Freelancer(String name, String surname, double salary, int time) {
        super(name, surname, salary);
        this.time = time;
    }

    @Override
    public double calculateSalary() {
    return time * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s (Фрилансер): Среднемесячная заработная плата (фиксированная почасовая оплата %.2f (руб.) (отработано %.0f часов)): %.2f (руб.)",
                surname, name, salary, time, calculateSalary());
    }


}
