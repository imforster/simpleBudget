package com.relic.budget.repository;

import com.relic.budget.entities.Deposit;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DepositRepository extends PagingAndSortingRepository<Deposit, String> {

}