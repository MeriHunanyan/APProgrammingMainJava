package Unit5HW2;

public class EmployeeTester {

    public static void main(String[] args)
    {
        Employee Bob = new Employee("Bob", 16000);
        System.out.println(Bob.getName());
        System.out.println(Bob.getSalary());
        Bob.raiseSalary(10);
        System.out.println(Bob.getSalary());
    }
}
