package br.com.nogueira.openbank.integration;

import br.com.nogueira.openbank.entity.Transaction;
import com.acme.banking.model.OBTransaction6;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.function.Function;

public class OBTransactionAdapter {

    public Transaction adapt(final OBTransaction6 obTransaction6) {
        return transactionFunction.apply(obTransaction6);
    }

    private final Function<OBTransaction6, Transaction> transactionFunction = obTransaction6 -> {
        var transaction = new Transaction();
        transaction.setAccountNumber(Integer.valueOf(obTransaction6.getAccountId()));

        var amount = lift(obTransaction6, o -> BigDecimal.valueOf(Double.parseDouble(o.getAmount().getAmount())));
        var fx = lift(obTransaction6, o -> o.getCurrencyExchange().getExchangeRate());

        transaction.setAmount(amount.orElse(BigDecimal.ZERO).multiply(fx.orElse(BigDecimal.ONE)));


        lift(obTransaction6, o -> obTransaction6.getCurrencyExchange().getUnitCurrency())
                .ifPresent(transaction::setCurrency);
        lift(obTransaction6, o -> obTransaction6.getCreditDebitIndicator().toString())
                .ifPresent(transaction::setType);
        lift(obTransaction6, o -> obTransaction6.getMerchantDetails().getMerchantName())
                .ifPresent(transaction::setMerchantName);
        lift(obTransaction6, o -> obTransaction6.getValueDateTime().toLocalDate())
                .ifPresent(transaction::setDate);

        return transaction;
    };


    private <T> Optional<T> lift(final OBTransaction6 transaction6, Function<OBTransaction6, T> func) {
        try {
            return Optional.of(func.apply(transaction6));
        } catch (Exception ex) {
            return Optional.empty();
        }
    }
}
