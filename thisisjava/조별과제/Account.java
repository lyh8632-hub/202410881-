package ch06.조별과제;   
public class Account {
    private String number;     
    private String owner;   
    private int money;   
    public Account(String number, String owner, int money) {
        this.number=number;
        this.owner=owner;
        this.money=money;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number=number;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner=owner;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money=money;
    }
}