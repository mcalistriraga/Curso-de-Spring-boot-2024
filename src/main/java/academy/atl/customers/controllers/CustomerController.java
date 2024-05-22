package academy.atl.customers.controllers;

import academy.atl.customers.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {
    @GetMapping("/customer/107") //Traer un cliente especifico
    public Customer getCustomer() {
        return null;
    }
/*
    @GetMapping("/customer")    //Traer Todos los Clientes
    public List <Customer> getAllCustomer() {
        return null;
    }
    @PostMapping("/customer/107)  //Agregar Cliente
    public void addCustomer(Customer customer){

    }

    @PostMapping("/customer/107)  //Eliminar  Cliente "
    public void removeCustomer(){

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
