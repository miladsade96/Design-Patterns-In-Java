package design_patterns.behavioral.command_pattern.app;

import design_patterns.behavioral.command_pattern.fw.Command;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class AddCustomerCommand implements Command {

    private CustomerService customerService;

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
