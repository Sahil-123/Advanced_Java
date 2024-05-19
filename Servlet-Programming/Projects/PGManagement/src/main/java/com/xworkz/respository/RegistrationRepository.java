package com.xworkz.respository;

import com.xworkz.dto.Customer;
import com.xworkz.dto.CustomerLogin;

public interface RegistrationRepository {
    public void register(Customer customer, CustomerLogin customerLogin);
}
