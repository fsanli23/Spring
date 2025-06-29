package com.sanli.bootstrap;

import com.sanli.entity.*;
import com.sanli.enums.Status;
import com.sanli.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;
    private final CustomerRepository customerRepository;

    private final ItemRepository itemRepository;

    private final CartRepository cartRepository;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository, CustomerRepository customerRepository,
                         CartRepository cartRepository, ItemRepository itemRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
        this.customerRepository = customerRepository;
        this.itemRepository = itemRepository;
        this.cartRepository = cartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Payment p1 = new Payment(LocalDate.of(2022, 04, 19), new BigDecimal("150000"), Status.SUCCESS);
        PaymentDetails pd = new PaymentDetails(new BigDecimal("14000"), new BigDecimal("10000"), LocalDate.of(2022, 3, 3));

        p1.setPaymentDetails(pd);


        Payment p2 = new Payment(LocalDate.of(2022, 04, 19), new BigDecimal("18000"), Status.SUCCESS);
        PaymentDetails pd2 = new PaymentDetails(new BigDecimal("12000"), new BigDecimal("100400"), LocalDate.of(2022, 3, 3));

        p2.setPaymentDetails(pd2);
        Merchant merchant = new Merchant("Amazon Merchant", "M123", new BigDecimal("3.25"), new BigDecimal("0.25"), 3);
        var customer = new Customer("mike", "gar", "asdawd", "rergs@Gmail.com", "123 main st");


        p1.setMerchant(merchant);
        p2.setMerchant(merchant);
        customerRepository.save(customer);

        Item item01 = new Item("milk", "DS01");
        Item item02 = new Item("bread", "DS03");
        Item item03 = new Item("tomato", "DS25");


        Cart cart1 = new Cart();
        Cart cart2 = new Cart();


        cart1.setItem(Arrays.asList(item01, item02, item03));
        cart2.setItem(Arrays.asList(item01, item02));


        itemRepository.save(item01);
        itemRepository.save(item02);
        itemRepository.save(item03);

        cartRepository.save(cart1);
        cartRepository.save(cart2);



        p1.setCustomer(customer);
        p2.setCustomer(customer);


        merchantRepository.save(merchant);
        paymentRepository.save(p1);
        paymentRepository.save(p2);

    }
}
