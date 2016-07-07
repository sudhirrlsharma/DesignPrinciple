package srp.bad;

/**
 * SRP violation
 * @author sudhirsh
 *
 */

public class Employee {
	String employeeName;
	String employeeNo;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public void insert(Employee e){
		//Database login
	}
	public void generateReport(Employee e){
		//Report generation logic
	}


}
