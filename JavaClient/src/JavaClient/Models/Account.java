package JavaClient.Models;


import static JavaClient.Services.MainService.acList;

public class Account {
    private int id;
    private String Username;
    private String Password;
    private int balance;

    public Account(String username) {
        Username = username;
        acList.add(this);
    }

    public String getUsername(){
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword() {
        Password = new StringBuilder(Username).reverse().toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
