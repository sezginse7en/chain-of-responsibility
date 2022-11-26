public class BankCEO extends ApprovalAuthority{
    @Override
    protected double getConfirmableLimit() {
        return Integer.MAX_VALUE; //:)
    }

    @Override
    protected String getRole() {
        return "CEO";
    }
}
