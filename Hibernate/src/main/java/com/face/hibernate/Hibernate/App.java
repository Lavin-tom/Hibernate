package com.face.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.face.hibernate.student.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student st=new Student();
    	st.setStid(111);
    	st.setName("Vishal");
    	st.setGender("Male");
        Configuration con =new Configuration().configure().addAnnotatedClass(Student.class);
        
        SessionFactory sefa =con.buildSessionFactory();
        Session se = sefa.openSession();
        Transaction t= se.beginTransaction();
        se.save(st);
        t.commit();
    }
}
