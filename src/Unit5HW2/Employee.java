package Unit5HW2;
/*
Name: Meri Hunanyan
date: 1/24/2025
assignment: Unit5HW2, P3.4
 */

/**
 * Represents an Employee object with name and salary
 */
class Employee {
    String name;
    double currentSalary;
    /*
    Constructor to create an object with a given name and salary
     */
    public Employee(String name, double currentSalary)
    {
        this.name = name;
        this.currentSalary = currentSalary;
    }
    /**
     * Gets the name of the employee
     *
     * @return name of the employee
     */
    public String getName()
    {
        return name;
    }
    /**
     * Gets the salary of the employee
     *
     * @return employee's salary
     */
    public Double getSalary()
    {
        return currentSalary;
    }
    /**
     * Gets the name of the employee
     *
     * @param byPercent What percentage you want to increase salary by
     */
    public void raiseSalary(double byPercent)
    {
        currentSalary = currentSalary + (byPercent / 100) * currentSalary; //calculating new salary
    }
}
