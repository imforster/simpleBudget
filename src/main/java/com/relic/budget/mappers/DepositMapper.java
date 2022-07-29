package com.relic.budget.mappers;

import com.relic.budget.dtos.DepositDto;
import com.relic.budget.entities.Deposit;

@org.mapstruct.Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE, componentModel = "spring")
public interface DepositMapper {

  Deposit depositDtoToDeposit(DepositDto depositDto);

  DepositDto depositToDepositDto(Deposit deposit);

  @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
  Deposit updateDepositFromDepositDto(
      DepositDto depositDto, @org.mapstruct.MappingTarget Deposit deposit);
}
