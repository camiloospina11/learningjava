package combinator;


import java.time.LocalDate;
import static combinator.CustomerRegistrationValidator.ValidationResult;
import static combinator.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public class Main
{
    public static void main(String[] args)
    {
        Customer customer = new Customer("Alice", "Alicegamil.com", "+5734182488", LocalDate.of(2000, 1, 1));
        //        System.out.println(new CustomerValidatorService().isValid(customer));
        // if valid we can store customer in db

//        System.out.println(CustomerRegistrationValidator.isEmailValid().apply(customer));
//        System.out.println(CustomerRegistrationValidator.isPhoneNumberValid().apply(customer));
//        System.out.println(CustomerRegistrationValidator.isAdult().apply(customer));

          ValidationResult result = CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAdult())
                .apply(customer);
        System.out.println(result);

        if(result != SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}
