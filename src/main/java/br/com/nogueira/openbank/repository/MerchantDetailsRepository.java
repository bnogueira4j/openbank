package br.com.nogueira.openbank.repository;

import java.util.Optional;

public interface MerchantDetailsRepository {
    Optional<String> findMerchantLogo(final String merchantName);
}
