package com.javaprojetcs.banking.repository;

import com.javaprojetcs.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository <Account, Long> {
}
