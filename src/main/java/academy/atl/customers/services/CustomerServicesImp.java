package academy.atl.customers.services;

import academy.atl.customers.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServicesImp implements CustomerService{

    private List<Customer> list = new ArrayList<>();

    public CustomerServicesImp() {
        list.add(new Customer(1, "John", "Doe", "john.doe@example.com", "123 Elm Street"));
        list.add(new Customer(2, "Jane", "Smith", "jane.smith@example.com", "456 Oak Street"));
    }

    public Optional<Customer> getCustomer(Integer id) {
        /*
        // ...tradicional
        for (Customer customer:list) {
            if (customer.getId().equals(id)) return customer;
        }
        return null;
        */
        return list.stream()
                .filter(customer->customer.getId().equals(id))
                .findFirst();
    }

    public List <Customer> getAllCustomer() {
        return list; // devuelve la lista
    }

    public boolean removeCustomer(Integer id) {
            /*
            // forma clasica
            for (Customer customer:list) {
                if (customer.getId().equals(id)) {
                    list.remove(customer);
                    break;
                }
            }
            */
        return list.removeIf(customer->customer.getId().equals(id));
    }


    public void addCustomer(Customer customer){
        list.add(customer);
    }


    public void updateCustomer(Integer id, Customer updateCustomer) {
        /*
        // clasico
        for (Customer customer: list) {
            if (customer.getId().equals(id)) {
                list.remove(customer);
                updateCustomer.setId(id);
                list.add(updateCustomer);
                break;
            }
        }*/
        list.removeIf(customer->customer.getId().equals(id));
        updateCustomer.setId(id);
        list.add(updateCustomer);
    }

    public List <Customer> searchCustomer(String email, String address) {
        //if ("mcalistri.raga@gmail.com".contains("email"))
        List <Customer> searchResult = new ArrayList<>();
        // ...tradicional
        for (Customer customer:list) {
            if ((email != null && !email.isEmpty()   && customer.getEmail().contains(email)) ||
                    (address != null && !address.isEmpty() && customer.getAddress().contains(address)))
                searchResult.add(customer);
        }

        return searchResult;

    }

}
