public class Aggregation {
  public static void main(String[] args) {
    Employee employee1 = new Employee("John");
    Employee employee2 = new Employee("Jane");

    Departement departement = new Departement("Human Resources");
    departement.addEmployee(employee1);
    departement.addEmployee(employee2);

    System.out.println("Employees in " + departement.getDeptName() + " are:");
    for (Employee employee : departement.getEmployees()) {
      System.out.println(employee.getEmployeeName());
    }
  }

}
