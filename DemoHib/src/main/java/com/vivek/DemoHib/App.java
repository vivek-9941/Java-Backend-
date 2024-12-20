package com.vivek.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Create an instance of the `aliens` entity and set its properties
    	
    	
    	name n1 = new name();
    	n1.setFname("vivek");
    	n1.setMname("annasaheb");
    	n1.setLname("mane");
    	
    
        aliens a1 = new aliens();
        a1.setAid(1);               // Set the alien ID
        a1.setAname(n1);      // Set the alien name
        a1.setAcolor("black");       // Set the alien color

        // Load the Hibernate configuration and specify annotated classes
        Configuration configuration = new Configuration()
                .configure()                  // Load configuration from hibernate.cfg.xml
                .addAnnotatedClass(aliens.class); // Register the `aliens` class as an entity

        // Create a SessionFactory, which is a heavyweight object responsible for database connections
        SessionFactory sFactory = configuration.buildSessionFactory();

        // Open a new session for interacting with the database
        Session session = sFactory.openSession();

        // Begin a transaction for performing database operations
        Transaction tx = session.beginTransaction();

        // Save the entity `a1` to the database
//        session.save(a1);
        	//fetch the data
        session.save(a1);
        a1 = (aliens) session.get(aliens.class, 2);
        System.out.println(a1);
        // Commit the transaction to finalize the database changes
        tx.commit();

        // Close the session to release database resources
        session.close();

        // Close the SessionFactory to release resources
        sFactory.close();
    }
}
