package com.spring.configuration;

import com.spring.data.Employee;
import com.spring.data.Roles;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbInit {
    public static void main(String[] args) {
        String title1 = "ADMIN";
        String title2 = "MANAGER";
        String title3 = "EMPLOYEE";
        // Create the EntityManagerFactory & EntityManager

        // test
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-cviceni");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Employee st = new Employee();
        Roles rl = new Roles();
        rl.setAutorization(title1);
        st.setFirstName("Radek");
        st.setLastName("Letacek");
        st.setEmail("Let1@uhk.cz");
        st.setUserName("letara");
        st.setPassword("heslo123");
        st.setTelNumber(603456789);
        st.setRoles(rl);

        em.persist(st);

        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
