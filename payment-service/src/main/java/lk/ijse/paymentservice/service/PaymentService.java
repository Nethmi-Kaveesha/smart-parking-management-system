package lk.ijse.paymentservice.service;

import lk.ijse.paymentservice.entity.Payment;
import lk.ijse.paymentservice.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public Payment create(Payment payment) {
        payment.setPaymentStatus("PAID");
        return repository.save(payment);
    }

    public List<Payment> getAll() {
        return repository.findAll();
    }

    public Payment getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Payment> getByBookingId(Long bookingId) {
        return repository.findByBookingId(bookingId);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
