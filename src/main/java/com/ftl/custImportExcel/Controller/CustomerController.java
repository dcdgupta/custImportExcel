package com.ftl.custImportExcel.Controller;
import com.ftl.custImportExcel.Service.CustomerService;
import com.ftl.custImportExcel.entity.Customer;
import com.ftl.custImportExcel.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin("http://127.0.0.1:5500/")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    CustomerService customerService;

    @GetMapping("/List")
    public List<Customer> fetchCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @CrossOrigin("http://127.0.0.1:5500/")
    @PostMapping("/Create")
    public String createCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
        return "Success";
    }
}


