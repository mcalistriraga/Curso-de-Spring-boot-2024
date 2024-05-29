package academy.atl.customers.controllers;

import academy.atl.customers.entities.Customer;
import academy.atl.customers.services.CustomerServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CustomerController {

    @Autowired // para q la variable se cargue
    private CustomerServicesImp service;

    @GetMapping("/customer/{id}") //Traer un cliente especifico
    public Optional<Customer> getCustomer(@PathVariable Integer id) {
        return service.getCustomer(id);
    }

    @GetMapping("/customer")    //Traer Todos los Clientes
    public List <Customer> getAllCustomer() {
        return service.getAllCustomer(); // devuelve la lista
    }

    @DeleteMapping("/customer/{id}")  //Eliminar  Cliente "
    public boolean removeCustomer(@PathVariable Integer id) {
        return service.removeCustomer(id);
    }


    @PostMapping("/customer")  //Agregar Cliente
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }


    @PutMapping("/customer/{id}")  //Actualizar: Modificar Cliente
    public void updateCustomer(@PathVariable Integer id, @RequestBody Customer updateCustomer) {
        service.updateCustomer(id, updateCustomer);
    }

    @GetMapping("/customer/search") // Busqueda
    public List <Customer> searchCustomer(@RequestParam(name = "email", required = false) String email,
                                          @RequestParam(name = "address", required = false) String address) {
        return service.searchCustomer(email, address);
    }
}