package hibernate.demo;

import hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent {
    public static void main(String[] args) {

        //create session factory
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        //create session
        Session session = sessionFactory.getCurrentSession();

        try{
            //creating JAVA object
            System.out.println("Creating student");
            Student student001 = new Student("Krzysiek", "Nawrocki", "kn@email.com");

            //start transaction
            session.beginTransaction();

            //save the student object
            session.save(student001);

            //commit transaction
            session.getTransaction().commit();

        }
        finally {
            sessionFactory.close();
        }

    }
}