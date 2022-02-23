import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();
        vehicle vob1=new vehicle();
        vob1.setVname("Omni");

        vehicle vob2=new vehicle();
        vob2.setVname("Maruti");

        user uob1=new user();
        uob1.setUname("Mahesh");

        uob1.getVob().add(vob1);
        uob1.getVob().add(vob2);

        entityManager.persist(uob1);

        entityManager.persist(vob1);
        entityManager.persist(vob2);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
