public interface BackInterface {
    int checkBalance();
    String addMoney(int money);
    String withDrawMoney(int money,String enterpassword);
    float calculateInterest(int years);

}
