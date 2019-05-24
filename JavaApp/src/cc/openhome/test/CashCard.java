package cc.openhome.test;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;

    public CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }
    
    public void store(int money){
        if (money > 0) {
            this.balance += money;
            if (money >= 1000) {
                this.bonus++;
            }
        }else{
            System.out.println("储值是负数？你是来捣乱的吗？");
        }
    }
    
    public void charge(int money){
        if (money > 0) {
            if (money <= this.balance) {
                this.balance -= money;
            }else{
                System.out.println("钱不够了！");
            }
        }else{
            System.out.println("扣负数，你是来存钱的么？");
        }
    }
    
    public int exchange(int bonus) {
        if (bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }

    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public int getBonus() {
        return bonus;
    }
    
    
}
