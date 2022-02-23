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

        vehicle_7 v1=new vehicle_7();
        v1.setVid(1);
        v1.setVname("car 1");

        vehicle_7 v2=new vehicle_7();
        v2.setVid(2);
        v2.setVname("car 2");

        vehicle_7 v3=new vehicle_7();
        v3.setVid(3);
        v3.setVname("car 3");

        vehicle_7 v4=new vehicle_7();
        v4.setVid(4);
        v4.setVname("car 4");

        String sid="3";

        entityManager.getTransaction().begin();

        // positional parameter binding
//        Query query = (Query) entityManager.createQuery("from vehicle_7 where vid>?1");
//
//        query.setInteger(1,Integer.parseInt(sid));
//
//        List<vehicle_7> list = query.list();
//
//        for (vehicle_7 ob:list)
//        {
//            System.out.println(ob.getVname());
//        }
//
//        System.out.println(list.size());

        // Named parameter binding

        Query query = (Query) entityManager.createQuery("from vehicle_7 where vid> :Id");

        query.setInteger("Id",Integer.parseInt(sid));

        List<vehicle_7> list = query.list();

        for (vehicle_7 ob:list)
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
