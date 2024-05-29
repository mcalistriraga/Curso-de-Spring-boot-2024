package academy.atl.customers.services;

import academy.atl.customers.entities.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Optional<Customer> getCustomer(Integer id);
    List<Customer> getAllCustomer();

    boolean removeCustomer(Integer id);

    void addCustomer(Customer customer);


    void updateCustomer(Integer id, Customer updateCustomer);

    List <Customer> searchCustomer(String email, String address);

    /*default void hacerAlgo() {
        System.out.print("Hacer Algo");

    }*/

}
