package Constructorinjction;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Apps {

	public static void main(String[] args) {
		
		
         ApplicationContext con  = new ClassPathXmlApplicationContext("constructor.xml");
         person p =(person) con.getBean("person");
         System.out.println(p);
	}

}
