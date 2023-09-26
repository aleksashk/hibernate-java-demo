package by.flameksandr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Item.class)
                .buildSessionFactory()) {

            Session session = null;
//            //CREATE
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
//            Item item = new Item("Milk", 80);
//            System.out.println(item);
//            session.persist(item);
//            System.out.println(item);

            //READ
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Item itemFromDb = session.get(Item.class, 1L);
            System.out.println(itemFromDb);

            session.getTransaction().commit();


        }
    }
}
