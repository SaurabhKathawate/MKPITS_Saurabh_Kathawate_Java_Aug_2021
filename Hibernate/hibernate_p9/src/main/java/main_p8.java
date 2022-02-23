import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main_p8 {
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
        a2.setCity("Home city");
        a2.setState("Home State");
        a2.setPincode(100000);

        emp_p8 ob=new emp_p8();
        ob.setName("ram");
        ob.getAd1().add(a1);         //added in collection so we used   .getAd1()
        ob.getAd1().add(a2);


        System.out.println("Saving Employee to Database");

//        entityManager.persist(ob);

        emp_p8 e1=entityManager.find(emp_p8.class,1l);
//        e1.setName("Mahesh");
//        entityManager.merge(e1);  //to update data....1   cmnt out 30 & "create" in persistence

        entityManager.remove(e1);   //to delete data....2   "delete" in persistence

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();

        System.out.println(e1.getAd1());  //to fetch the list of address eager is used in out of session

        entityManagerFactory.close();
    }
}
