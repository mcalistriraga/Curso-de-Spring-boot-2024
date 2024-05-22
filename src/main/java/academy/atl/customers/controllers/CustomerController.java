package academy.atl.customers.controllers;

import academy.atl.customers.entities.Customer;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CustomerController {

    private List <Customer> list = new ArrayList<>();

    public CustomerController () {
        list.add(new Customer(1, "John", "Doe", "john.doe@example.com", "123 Elm Street"));
        list.add(new Customer(2, "Jane", "Smith", "jane.smith@example.com", "456 Oak Street"));
    }

    @GetMapping("/customer/{id}") //Traer un cliente especifico
    //public Optional<Customer> getCustomer(@PathVariable Integer id) {
    public Optional<Customer> getCustomer(@PathVariable Integer id) {

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

    @GetMapping("/customer")    //Traer Todos los Clientes
    public List <Customer> getAllCustomer() {
        return list; // devuelve la lista
    }

    @DeleteMapping("/customer/{id}")  //Eliminar  Cliente "
    public boolean removeCustomer(@PathVariable Integer id) {
            /*
            // forma clasica
            for (Customer customer:list) {
                if (customer.getId().equals(id)) {
                    list.remove(customer);
                }
            }
            */
        return list.removeIf(customer->customer.getId().equals(id));
    }



/*
    @PostMapping("/customer/107)  //Agregar Cliente
    public void addCustomer(Customer customer){

    }

    @PutMapping("/customer/107)  //Modificar Cliente
    public void updateCustomer() {
    }

    @PutMapping("/customer/107)  //Buscar Cliente
    public List <Customer> searchCustomer(){
        return null;
    }


    @GetMapping("/prueba4")
    public List <Customer> prueba4() {
        //Customer c = new Customer("Lucas", "234234234", "Lucasmoy@atl.academy", "Siempre viva 123");

        List <Customer> customers= new ArrayList<>();

        Customer c = new Customer();
        c.setFirstname("Lucas");
        c.setLastname("Moy");
        c.setEmail("Lucasmoy@atl.academy");
        c.setAddress("Siempre viva 123");

        customers.add(c);

        Customer c2 = new Customer();
        c2.setFirstname("María");
        c2.setLastname("Gonzales");
        c2.setEmail("maria1234@atl.academy");
        c2.setAddress("Roque 555");

        customers.add(c2);

        return customers;
    }
*/
}
