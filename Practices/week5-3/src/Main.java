public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("1234", "insang1");
        emp1.setWorkHours(40);
        emp1.setOverTimeHours(10);
        emp1.setPayManager(new ClassicalPayment());
        System.out.println(emp1.pay());

        Employee emp2 = new Employee("2345", "insang2");
        emp2.setWorkHours(40);
        emp2.setOverTimeHours(10);
        emp2.setPayManager(new NewPayment());
        System.out.println(emp2.pay());
    }
}
