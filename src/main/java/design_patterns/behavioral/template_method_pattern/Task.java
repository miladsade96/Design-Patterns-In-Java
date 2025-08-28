package design_patterns.behavioral.template_method_pattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Task {

    private AuditTrail auditTrail;

    public Task() {
        this.auditTrail = new AuditTrail();
    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
