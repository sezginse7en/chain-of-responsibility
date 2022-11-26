public class BankDirector extends ApprovalAuthority {

    @Override
    protected double getConfirmableLimit() {
        return 1000000;
    }

    @Override
    protected String getRole() {
        return "Bank Director";
    }
}
