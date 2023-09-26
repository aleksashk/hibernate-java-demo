package by.flameksandr;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .buildSessionFactory()) {
        }
    }
}
