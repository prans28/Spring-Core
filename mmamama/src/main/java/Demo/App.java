package Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class App {

	public static void main(String[] args) {
             
		ApplicationContext context= new ClassPathXmlApplicationContext("demo.xml");
		Student s =  (Student) context.getBean("v");
		System.out.println(s);
	}

}
