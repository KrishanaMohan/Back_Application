import java.util.UUID;

public class SBI_User implements BackInterface{
     private String AccountNo;
    private  String name;
    private int balance;
    private String password;
    private static float rateOfInterest;
    public SBI_User(String name,int balance,String password) {
        this.name=name;
        this.balance=balance;
        this.AccountNo= String.valueOf(UUID.randomUUID());
        this.password=password;
    }

    public void changePassword(String password){
        //OTP Vairification
        this.password=password;
    }
    public String getAccountNo(){
        return AccountNo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int money) {
        balance=balance+money;

        return  money+" Successfully Added Money Total balance is "+balance;
    }

    @Override
    public String withDrawMoney(int money,String enterpassword) {
        if(password==enterpassword) {
            int x=balance -money;

            if ( x<500)
                return "You have to keep atlest 500 balance in your account ";
            else {
                balance -= money;
                return "Money is withdraw Succesfully And rest of Balance is " + balance;
            }

        }

            return "You have Enter worng password";
    }

    @Override
    public float calculateInterest(int years) {
        float interest=balance*years*rateOfInterest/100;
        return interest;
    }
}
