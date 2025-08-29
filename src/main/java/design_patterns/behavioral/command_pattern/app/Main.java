package design_patterns.behavioral.command_pattern.app;

import design_patterns.behavioral.command_pattern.fw.Button;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        AddCustomerCommand addCustomerCommand = new AddCustomerCommand(customerService);
        Button button = new Button(addCustomerCommand);
        button.click();
    }
}
