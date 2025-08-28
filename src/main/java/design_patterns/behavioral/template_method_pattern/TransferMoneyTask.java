package design_patterns.behavioral.template_method_pattern;

public class TransferMoneyTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Transferring Money");
    }
}
