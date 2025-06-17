package lk.ijse.paymentservice.controller;

import lk.ijse.paymentservice.entity.Payment;
import lk.ijse.paymentservice.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return service.create(payment);
    }

    @GetMapping
    public List<Payment> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Payment getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/booking/{bookingId}")
    public List<Payment> getByBookingId(@PathVariable Long bookingId) {
        return service.getByBookingId(bookingId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
