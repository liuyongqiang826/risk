package com.hope.risk.controller.deposit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class DepositRiskController {

	@GetMapping("/deposit-max-amount")
	public String maxDepositAmtJudge() {
		
		log.info("trace = {}",Thread.currentThread().getName());
		return "hello";
	}
}
