package MovieDB;

import javax.persistence.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Open a database connection
        // (create a new database if it doesn't exist yet):
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("MovieDB.odb");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Actor a = new Actor("Cheroro", "test", "USA");
        Movie m = new Movie(
                "MHR",
                "today",
                "aaa",
                100,
                1,
                2,
                4,
                5
        );
        em.persist(a);
        em.persist(m);

        Character c = new Character("B", a, true);
        Director d = new Director("D");

        m.addGenre(":(");
        m.addCharacter(c);
        m.addDirector(d);

        em.persist(c);
        em.persist(d);

        em.getTransaction().commit();

//        // Find the number of test.Point objects in the database:
//        Query q1 = em.createQuery("SELECT COUNT(p) FROM Point p");
//        System.out.println("Total Points: " + q1.getSingleResult());
//
//        // Find the average X value:
//        Query q2 = em.createQuery("SELECT AVG(p.x) FROM Point p");
//        System.out.println("Average X: " + q2.getSingleResult());
//
//        // Retrieve all the test.Point objects from the database:
//        TypedQuery<Point> query =
//            em.createQuery("SELECT p FROM Point p", Point.class);
//        List<Point> results = query.getResultList();
//        for (Point p : results) {
//            System.out.println(p);
//        }

        // Close the database connection:
        em.close();
        emf.close();
    }
}