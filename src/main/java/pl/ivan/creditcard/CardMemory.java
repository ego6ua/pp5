package pl.ivan.creditcard;

import java.util.Optional;

public interface CardMemory {
    void save(CreditCard card);

    Optional<CreditCard> findByNumber(String cardNumber);
}
