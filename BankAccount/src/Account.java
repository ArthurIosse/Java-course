public class Account {
    private String name;
    private double creditLimit;
    private String emailAdress;

    public Account() {
        this("default",0.0,"defaultEmail");
        System.out.println("Default constructor called");
    }

    public Account(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public Account(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName()
    {
        return name;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }
}
