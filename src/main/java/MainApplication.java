public class MainApplication {

    public static void main(String[] args){

        BankTeller bankTeller = new BankTeller();
        BankManager bankManager = new BankManager();
        BankDirector bankDirector = new BankDirector();
        BankCEO bankCEO = new BankCEO();

        bankTeller.setSuccessor(bankManager);
        bankManager.setSuccessor(bankDirector);
        bankDirector.setSuccessor(bankCEO);

        double usedCreditAmount = 8000;
        bankTeller.handleRequest(usedCreditAmount);


    }


}
