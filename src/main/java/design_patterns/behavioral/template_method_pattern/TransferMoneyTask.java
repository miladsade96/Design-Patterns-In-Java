package design_patterns.behavioral.template_method_pattern;

public class TransferMoneyTask {

    private AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Transferring Money");
    }
}
