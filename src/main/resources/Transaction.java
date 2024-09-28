@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    private String type;
    private Double amount;
    private Timestamp timestamp;

    // Constructors, Getters, Setters
    
    public Account getAccount() {
    	return this.account;
    }
    
    public String getType() {
    	return this.type;
    }
    
    public Timestamp getTimestamp() {
    	return this.timestamp;
    }
    
    public Double getAmount() {
    	return this.amount;
    }
    
    public void SetAccount(Account id) {
    	this.account=id;
    }
    public void SetType(String id) {
    	this.type=id;
    } 
    public void SetAmount(Double id) {
    	this.amount=id;
    }
    public void getTimestamp(Timestamp t) {
    	this.timestamp=t;
    }
}
