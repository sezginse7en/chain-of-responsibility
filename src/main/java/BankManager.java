public class BankManager extends ApprovalAuthority{
    @Override
    protected double getConfirmableLimit() {
        return 10000;
    }

    @Override
    protected String getRole() {
        return "Bank Manager";
    }
}
