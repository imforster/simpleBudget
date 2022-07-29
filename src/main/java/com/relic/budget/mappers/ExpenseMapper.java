package com.relic.budget.mappers;

import com.relic.budget.dtos.ExpenseDto;
import com.relic.budget.entities.Expense;

@org.mapstruct.Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE, componentModel = "spring")
public interface ExpenseMapper {

  Expense expenseDtoToExpense(ExpenseDto expenseDto);

  ExpenseDto expenseToExpenseDto(Expense expense);

  @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
  Expense updateExpenseFromExpenseDto(
      ExpenseDto expenseDto, @org.mapstruct.MappingTarget Expense expense);
}
