package design_patterns.behavioral.template_method_pattern;

public class GenerateReportTask {

    private AuditTrail auditTrail;

    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Generating Report");
    }
}
