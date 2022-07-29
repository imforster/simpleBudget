package com.relic.budget.services;

import com.relic.budget.dtos.DepositDto;
import com.relic.budget.entities.Deposit;
import com.relic.budget.mappers.DepositMapper;
import com.relic.budget.repository.DepositRepository;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DepositService {

  private final DepositRepository depositRepository;

  private final DepositMapper depositMapper;

  public DepositService(DepositRepository depositRepository, DepositMapper depositMapper) {
    this.depositRepository = depositRepository;
    this.depositMapper = depositMapper;
  }

  public Optional<DepositDto> findById(String id) {
    Optional<Deposit> myDeposit = depositRepository.findById(id);
    if (myDeposit.isPresent()) {
      return Optional.of(depositMapper.depositToDepositDto(myDeposit.get()));
    } else {
      return Optional.empty();
    }
  }

  public void createDeposit(@RequestBody DepositDto depositDto) {
    depositRepository.save(depositMapper.depositDtoToDeposit(depositDto));
  }

  public void deleteDeposit(String id) {
    depositRepository.deleteById(id);
  }

  public void updateDeposit(@RequestBody DepositDto depositDto) {
    Optional<Deposit> myDeposit = depositRepository.findById(depositDto.getId());
    if (myDeposit.isPresent()) {

    } else {
      throw new EntityNotFoundException("Invalid id specified: " + depositDto.getId());
    }
  }
}
