package Demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext	cob=new ClassPathXmlApplicationContext("Demo1.xml");
		            B b= (B) cob.getBean("bref");
		            System.out.print(b.getName());
		            System.out.print(b.getM());

		            
		

	}

}
