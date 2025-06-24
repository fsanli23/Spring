package com.sanli.bootstrap;

import com.sanli.entity.Payment;
import com.sanli.entity.PaymentDetails;
import com.sanli.enums.Status;
import com.sanli.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    PaymentRepository paymentRepository;

    public DataGenerator(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Payment p1 = new Payment(LocalDate.of(2022,04,19),new BigDecimal("150000"), Status.SUCCESS);
        PaymentDetails pd= new PaymentDetails(new BigDecimal("14000"),new BigDecimal("10000"),LocalDate.of(2022,3,3));

        p1.setPaymentDetails(pd);


        Payment p2 = new Payment(LocalDate.of(2022,04,19),new BigDecimal("18000"), Status.SUCCESS);
        PaymentDetails pd2= new PaymentDetails(new BigDecimal("12000"),new BigDecimal("100400"),LocalDate.of(2022,3,3));

        p2.setPaymentDetails(pd2);

        paymentRepository.save(p1);
        paymentRepository.save(p2);

    }
}
