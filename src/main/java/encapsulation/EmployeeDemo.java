package encapsulation;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setID(101);
        e.setName("Sofian");
        e.setJobTitle("SM");
        e.setSalary(12000);

        System.out.println(e.getID());
        System.out.println(e.getJobTitle());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
