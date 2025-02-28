import java.util.ArrayList;
import java.util.List;

 class Departement {
  private String deptName;

  private List<Employee> employees;


  public Departement(String deptName) {
    this.deptName = deptName;
    this.employees = new ArrayList<>();
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public String getDeptName() {
    return deptName;
  }

}
