import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        vehicle_4 v1=new vehicle_4();
        v1.setVid(1);
        v1.setVname("car 1");

        vehicle_4 v2=new vehicle_4();
        v2.setVid(2);
        v2.setVname("car 2");                    // ...(1) Transient object


        entityManager.getTransaction().begin();


        entityManager.persist(v1);
        entityManager.persist(v2);

        v2.setVname("updated vehicle");         // ...(2) persistence state

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();

//        v2.setVname("updated vehicle 1");       // ...(3) detached state


        entityManagerFactory.close();
    }
}
