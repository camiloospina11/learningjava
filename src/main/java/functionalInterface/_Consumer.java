package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer
{
    public static void main(String[] args)
    {
        Customer customer = new Customer("Maria", "32134455");
        Customer biCustomer = new Customer("Maria", "1111");
        greetCustomer(customer);
        System.out.println("Consumer Functional interface");
        greetCustomerConsumer.accept(customer);
//       new Customer("Maria", "32134455");
//       new Customer("Yeison", "32111233");
//       new Customer("Cris", "32555566");
        System.out.println("BiConsumer Functional interface");
        greetCustomerBiConsumer.accept(biCustomer, false);

    }

    // Declarative
    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello "+ customer.customerName+
            ", thanks for registering number " +
            customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) -> System.out.println("Hello "+ customer.customerName+
            ", thanks for registering number " +
            (showPhoneNumber ? customer.customerPhoneNumber : "xxxxxx"));

    // imperative
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.customerName+
                ", thanks for registering number " +
                customer.customerPhoneNumber);
    }


    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber)
        {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
