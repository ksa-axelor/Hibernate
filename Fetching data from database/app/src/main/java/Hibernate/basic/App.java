/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Hibernate.basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
//    public String getGreeting() {
//        return "Hello World!";
//    }

    public static void main(String[] args) {
//     	System.out.println(new App().getGreeting());
      
    	Student temp = new Student();
    	temp.setId(101);
    	temp.setName("1O1");
    
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	Transaction ts = session.beginTransaction();
//    	session.beginTransaction();
    	
    	session.save(temp);

    	ts.commit();
//    	session.getTransaction().commit();
    	
    	session.close();
    	
//    	System.out.println(temp);
    }
}
