package mam;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext p = new ClassPathXmlApplicationContext("config.xml");
        Student s  = (Student) p.getBean("v");
        System.out.println( s );
    }
}
