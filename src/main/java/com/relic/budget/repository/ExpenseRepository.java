package com.relic.budget.repository;

import com.relic.budget.entities.Expense;

public interface ExpenseRepository extends
    org.springframework.data.repository.PagingAndSortingRepository<Expense, String> {

}