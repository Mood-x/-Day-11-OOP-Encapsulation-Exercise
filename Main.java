//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account account_1 = new Account("01", "Mohammed", 10000);
        Account account_2 = new Account("2", "Ali");
        Account account_3 = new Account("03", "Ahmed");

        System.out.println(account_2.getId());
        System.out.println(account_2.getName());
        System.out.println(account_2.getBalance());

        account_2.setBalance(500);
        account_2.setId("02");
        account_2.setName("Maha");

        System.out.println(account_1.toString());
        System.out.println(account_2.toString());
        System.out.println(account_3.toString());

        System.out.println("---------------------");
        account_1.credit(4000);
        account_1.debit(1000);

        account_1.transferTo(account_2, 2000);
        account_1.transferTo(account_3, 3000);

        System.out.println(account_1.toString());
        System.out.println(account_2.toString());
        System.out.println(account_3.toString());

//    ======================================= EMPLOYEE =======================================

        Employee employee_1 = new Employee("1", "Ahmed", 12000);
        Employee employee_2 = new Employee("02", "Saleh", 15400);
        Employee employee_3 = new Employee("03", "Fahad", 11300);

        System.out.println(employee_1.getId());
        System.out.println(employee_1.getName());
        System.out.println(employee_1.getSalary());


        employee_1.setId("01");
        employee_1.setName("Mohammed");
        employee_1.setSalary(9000);
        System.out.println(employee_1.toString());
        System.out.println(employee_2.toString());
        System.out.println(employee_3.toString());
        System.out.println("-----------------------------------------------------");
        System.out.println("Annual Salary for " + employee_1.getName() + ": " + employee_1.getAnnualSalary());
        System.out.println("Annual Salary for " + employee_2.getName() + ": " + employee_2.getAnnualSalary());
        System.out.println("Annual Salary for " + employee_3.getName() + ": " + employee_3.getAnnualSalary());
        System.out.println();
        System.out.println("New Salary for " + employee_1.getName() + "after raised: " + employee_1.raisedSalary(10));
        System.out.println("New Salary for " + employee_2.getName() + "after raised: " + employee_2.raisedSalary(4));
        System.out.println("New Salary for " + employee_3.getName() + "after raised: " + employee_3.raisedSalary(5));
        System.out.println();
        System.out.println(employee_1.toString());
        System.out.println(employee_2.toString());
        System.out.println(employee_3.toString());

    }
}