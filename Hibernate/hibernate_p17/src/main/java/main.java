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

        vehicle_6 v1=new vehicle_6();
        v1.setVid(1);
        v1.setVname("car 1");

        vehicle_6 v2=new vehicle_6();
        v2.setVid(2);
        v2.setVname("car 2");

        vehicle_6 v3=new vehicle_6();
        v3.setVid(3);
        v3.setVname("car 3");

        vehicle_6 v4=new vehicle_6();
        v4.setVid(4);
        v4.setVname("car 4");

        String sid="2";

        entityManager.getTransaction().begin();

        Query query = (Query) entityManager.createQuery("from vehicle_6 where vid>"+sid);
//        query.setInteger("Id",2);

        List<vehicle_6> list = query.list();

        for (vehicle_6 ob:list)
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
