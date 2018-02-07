package javatpoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test 
{
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("javatpoint/applicationContext.xml");
		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		//create table
		int status = dao.saveEmployee(new Employee(102,"Amit",35000));
		System.out.println(status);
		//update table
		int status1=dao.saveEmployee(new Employee(103,"Sonoo",15000));
		System.out.println(status1);
		int status2=dao.saveEmployee(new Employee(104,"Vinay",25000));
		System.out.println(status2);
		int status3=dao.updateEmployee(new Employee(103,"Vikram",65000));
		System.out.println(status3);
		//delete table
		Employee e=new Employee(); 
		e.setId(104);
		int status4=dao.deleteEmployee(e); 
		System.out.println(status4);
	}
}
