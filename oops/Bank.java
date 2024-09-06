class Account{
    public String name; 
    protected String email;
    private String password;

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Nihar";
        acc1.email = "niharnandoskar@gmail.com";
        acc1.setPassword("abcd");
        System.out.println(acc1.getPassword());
    }
}
