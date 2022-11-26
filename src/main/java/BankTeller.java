public class BankTeller extends ApprovalAuthority{
    @Override
    protected double getConfirmableLimit() {
        return 1000;
    }

    @Override
    protected String getRole() {
        return "Bank Teller";
    }
}
