package com.ftl.custImportExcel.Service;





        import com.ftl.custImportExcel.entity.Customer;
        import com.ftl.custImportExcel.repository.CustomerRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import java.util.Optional;

@Service

public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer getCustomerById(long id) {
        return customerRepository.findById(id).orElse(null);
    }


    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }




}




