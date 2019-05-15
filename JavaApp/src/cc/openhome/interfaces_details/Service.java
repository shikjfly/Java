package cc.openhome.interfaces_details;

public class Service implements Some, Other {
    @Override
    public void execute() {
        System.out.println("execute()");
    }
    @Override
    public void doSome() {
        System.out.println("doSome()");        
    }
    @Override
    public void doOther() {
        System.out.println("doOther()");        
    }
    @Override
    public void doService() {
        System.out.println("doService()");        
    }
}
