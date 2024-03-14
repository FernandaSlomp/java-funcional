package com.amigoscode.functionalinterface;

import com.amigoscode.functionalinterface.model.Customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer fer = new Customer("Fer", "12345454");

        //normal java function
        greetCustomer(fer);
        //use interface
        greetCustomerConsumer.accept(fer);

        greetCustomerConsumerV2.accept(fer, false);
    }

    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello" + customer.getName() +
                    "Thanks for ou registration number " + customer.getPhoneNumber());

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showNumber) -> System.out.println("Hello" + customer.getName() +
                    "Thanks for ou registration number " +   (showNumber ? customer.getPhoneNumber() : "******"));

    static void greetCustomer(Customer customer){
        System.out.println("Hello" + customer.getName() +
        "Thanks for ou registration number" + customer.getPhoneNumber());
    }

}
