package mappingrealtion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        laptop lap = new laptop();
        lap.setLid(102);
        lap.setLname("lenovo");

        student s = new student();
        s.setName("vivek");
        s.setMarks(100);
        s.setRollno(4);
        s.setLaptop(lap);

        Configuration configuration = new Configuration().configure().addAnnotatedClass(laptop.class).addAnnotatedClass(student.class);

        SessionFactory sFactory = configuration.buildSessionFactory();

        Session session = sFactory.openSession();
        Transaction trx = session.beginTransaction();
        
        session.save(lap);
        session.save(s);
        
        trx.commit();
        session.close();
        sFactory.close();
    }
}
