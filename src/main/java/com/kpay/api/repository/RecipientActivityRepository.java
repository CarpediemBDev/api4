package com.kpay.api.repository;

import com.kpay.api.model.RecipientActivity;
import com.kpay.api.model.SownActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface RecipientActivityRepository extends JpaRepository<RecipientActivity, BigInteger> {

    Optional<RecipientActivity> findTop1BySownActivityIdxAndRecipientIdOrderByIdxAsc(BigInteger idx, long userId);
}
