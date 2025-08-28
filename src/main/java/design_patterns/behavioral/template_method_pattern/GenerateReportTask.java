package design_patterns.behavioral.template_method_pattern;

public class GenerateReportTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Generating Report");
    }
}
