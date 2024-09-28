@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private String accountNumber;
    private Double balance;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactions = new ArrayList<>();

    // Constructors, Getters, Setters
    
    public Long getId() {
    	return this.id;
    }
    
    public Customer getCustomer() {
    	return this.customer;
    }
    
    public String getAccountNumber() {
    	return this.accountNumber;
    }
    
    public Double getBalance() {
    	return this.balance;
    }
    
    public void SetId(Long id) {
    	this.id=id;
    }
    public void SetCustomer(Customer id) {
    	this.customer=id;
    } 
    public void SetAccountNumber(String id) {
    	this.accountNumber=id;
    }
    
    public void setBalance(double balance) {
    	this.balance=balance;
    }
}
