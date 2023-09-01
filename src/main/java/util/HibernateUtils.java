package util;

import entity.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static SessionFactory sessionFactory;

    public static void getSessionFactory() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration() //указываем энтити которые будут в БД
                        .addAnnotatedClass(Customer.class)
                        .addAnnotatedClass(Cart.class)
                        .addAnnotatedClass(CustomerDetails.class)
                        .addAnnotatedClass(Order.class)
                        .addAnnotatedClass(OrderDetails.class)
                        .addAnnotatedClass(OrderOrdersDetails.class)
                        .buildSessionFactory();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}