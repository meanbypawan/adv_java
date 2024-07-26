package p1;

public class Customer {
   private int id;
   private String name;
   private String address;
   private int age;
   private String contact;
   private String nomineeName;
   private String accountNumber;
   private String qualification;
   private String accountType;

    public Customer() {
    }
    
    public Customer(int id, String name, String address, int age, String contact, String nomineeName, String accountNumber, String qualification, String accountType) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.contact = contact;
        this.nomineeName = nomineeName;
        this.accountNumber = accountNumber;
        this.qualification = qualification;
        this.accountType = accountType;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getNomineeName() {
        return nomineeName;
    }

    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", contact=" + contact + ", nomineeName=" + nomineeName + ", accountNumber=" + accountNumber + ", qualification=" + qualification + ", accountType=" + accountType + '}';
    }
    
}
