package local.youngw417.javaorders.services;

import local.youngw417.javaorders.models.Payment;
import local.youngw417.javaorders.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "paymentService")
public class PaymentServicesImpl implements PaymentServices{

    @Autowired
    private PaymentRepository paymentrepos;

    @Transactional
    @Override
    public Payment save(Payment payment) {
        return paymentrepos.save(payment);
    }
}
