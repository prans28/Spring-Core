package springlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App {

	public static void main(String[] args) {
	//	ApplicationContext p = new ClassPathXmlApplicationContext("springlifecycle.xml");
		AbstractApplicationContext p = new ClassPathXmlApplicationContext("springlifecycle.xml");

        samosa s  = (samosa) p.getBean("springlife");
        System.out.println( s );
        p.registerShutdownHook();

	}

}
