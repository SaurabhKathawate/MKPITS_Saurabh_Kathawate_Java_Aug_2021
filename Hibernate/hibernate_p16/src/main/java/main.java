import org.hibernate.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        vehicle_5 v1=new vehicle_5();
        v1.setVid(1);
        v1.setVname("car 1");

        vehicle_5 v2=new vehicle_5();
        v2.setVid(2);
        v2.setVname("car 2");

        vehicle_5 v3=new vehicle_5();
        v3.setVid(3);
        v3.setVname("car 3");

        vehicle_5 v4=new vehicle_5();
        v4.setVid(4);
        v4.setVname("car 4");

        entityManager.getTransaction().begin();

        Query query = (Query) entityManager.createQuery("from vehicle_5");

        query.setFirstResult(2);
        query.setMaxResults(1);

        List<vehicle_5> list = query.list();

        for (vehicle_5 ob:list)
        {
            System.out.println(ob.getVname());
        }

        System.out.println(list.size());

//        entityManager.persist(v1);
//        entityManager.persist(v2);
//        entityManager.persist(v3);
//        entityManager.persist(v4);

        entityManager.getTransaction().commit();

        entityManager.close();

        entityManagerFactory.close();
    }
}
