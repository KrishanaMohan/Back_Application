public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SBI_User krishana=new SBI_User("Krishana",500,"abc");
        String accountNo=krishana.getAccountNo();
        System.out.println("Your Account No"+accountNo);
        String add=krishana.addMoney(100);
        System.out.println(add);
        String withdraw=krishana.withDrawMoney(50,"abc");
        System.out.println(withdraw);
        krishana.changePassword("xyz");
        String withdraw1=krishana.withDrawMoney(50,"xyz");
        System.out.println(withdraw1);
        String withdraw2=krishana.withDrawMoney(50,"xyz");
        System.out.println(withdraw2);
    }
}
// 1. fund transfer(using hash Map)
// Switch case