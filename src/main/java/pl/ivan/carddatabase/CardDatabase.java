package pl.ivan.carddatabase;

import java.util.Optional;

import pl.ivan.creditcard.CardMemory;
import pl.ivan.creditcard.CreditCard;

public class CardDatabase implements CardMemory {
    @Override
    public void save(CreditCard card) {

    }

    @Override
    public Optional<CreditCard> findByNumber(String s) {
        return Optional.empty();
    }
}
