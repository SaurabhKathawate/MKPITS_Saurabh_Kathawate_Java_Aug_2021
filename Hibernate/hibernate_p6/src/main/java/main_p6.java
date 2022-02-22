import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main_p6 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        Address a1=new Address();
        a1.setCity("Nagpur");
        a1.setState("Maharashtra");
        a1.setPincode(440030);

        Address a2=new Address();
        a2.setCity("Home-Ramtek");
        a2.setState("Home-Maharashtra");
        a2.setPincode(440000);

        emp_p6 eob1=new emp_p6();
        eob1.setName("Saurabh");
        eob1.setEmail("sbk@gmail.com");
        eob1.setOffice_add(a1);
        eob1.setHome_add(a2);

        System.out.println("Saving Employee to Database");
        entityManager.persist(eob1);

        entityManager.getTransaction().commit();

//      close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
