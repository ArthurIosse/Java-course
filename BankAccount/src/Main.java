public class Main {

    public static void main(String[] args) {
        Account arthursAccount = new Account("Arthur", 1000.0);
        System.out.println(arthursAccount.getName() + "'s limit is:" + arthursAccount.getCreditLimit());
    }
}
