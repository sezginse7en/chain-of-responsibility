public abstract class ApprovalAuthority {

    protected ApprovalAuthority successor;

    abstract protected double getConfirmableLimit();
    abstract protected String getRole();

    public void setSuccessor(ApprovalAuthority approvalAuthority){
        this.successor = approvalAuthority;
    }

    public void handleRequest(double creditAmount){

        if(getConfirmableLimit() > creditAmount){
            System.out.println("Credit approved : $" + creditAmount + ", My role is " + getRole());
        }else{
            successor.handleRequest(creditAmount);
        }


    }



}
