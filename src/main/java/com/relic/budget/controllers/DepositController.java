package com.relic.budget.controllers;

import com.relic.budget.dtos.DepositDto;
import com.relic.budget.entities.Deposit;
import com.relic.budget.mappers.DepositMapper;
import com.relic.budget.repository.DepositRepository;
import com.relic.budget.services.DepositService;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DepositController {

  private final DepositService depositService;
  private final DepositMapper depositMapper;
  private final DepositRepository depositRepository;

  public DepositController(DepositService depositService, DepositMapper depositMapper, DepositRepository depositRepository) {
    this.depositService = depositService;
    this.depositMapper = depositMapper;
    this.depositRepository = depositRepository;
  }

  @GetMapping("/deposit/find/{id}")
  public ResponseEntity<DepositDto> findById(@PathVariable String id) {
    Optional<DepositDto> myDeposit = depositService.findById(id);
    if (myDeposit.isPresent()) {
      return ResponseEntity.ok(myDeposit.get());
    } else {
      return ResponseEntity.badRequest().build();
    }
  }

  @PostMapping("/deposit/create")
  public ResponseEntity createDeposit(@RequestBody DepositDto depositDto) {
    depositService.createDeposit(depositDto);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping("/deposit/delete/{id}")
  public ResponseEntity deleteDeposit(@PathVariable String id) {
    depositService.deleteDeposit(id);
    return ResponseEntity.ok().build();
  }

  @PatchMapping("/deposit/update")
  public ResponseEntity updateDeposit(@RequestBody DepositDto depositDto) {
    if (depositDto == null) {
      return ResponseEntity.badRequest().build();
    }
    depositService.updateDeposit(depositDto);
    return ResponseEntity.ok().build();
  }
}
