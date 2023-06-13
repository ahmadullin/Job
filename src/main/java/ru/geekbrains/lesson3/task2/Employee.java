package ru.geekbrains.lesson3.task2;

import java.util.Random;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected double salary; // Ставка заработной платы

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    static Random random = new Random();

    @Override
    public int compareTo(Employee o) {
        int resName = name.compareTo(o.name);
        int resSurname = surname.compareTo(o.surname);
        if (resName == 0){
            int resSalary = Double.compare(calculateSalary(), o.calculateSalary());
            if (resSalary == 0){
                return String.CASE_INSENSITIVE_ORDER.compare(surname,o.surname);
            }
            return resSalary;
        }
        return resName;
    }
}
