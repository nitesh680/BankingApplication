public class BankingApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Retrieve all customers with their accounts
            getAllCustomersWithAccounts(session);

            // Add new account for customer
            addNewAccount(1L, "1234567890", 5000.0, session);

            // Delete a customer and cascade delete associated accounts and transactions
            deleteCustomer(2L, session);

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
