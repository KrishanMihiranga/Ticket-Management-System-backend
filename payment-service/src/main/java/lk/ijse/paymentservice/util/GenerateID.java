package lk.ijse.paymentservice.util;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GenerateID {
    public String generateUUID() {
        return UUID.randomUUID().toString();

    }

}
