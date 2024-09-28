@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Account> accounts = new ArrayList<>();

    //getters & setters.
    public Long getId() {
    	return this.id;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public String getEmail() {
    	return this.email;
    }
    public void SetId(Long id) {
    	this.id=id;
    }
    public void SetName(String id) {
    	this.name=id;
    } 
    public void SetEmail(String id) {
    	this.email=id;
    }
}
