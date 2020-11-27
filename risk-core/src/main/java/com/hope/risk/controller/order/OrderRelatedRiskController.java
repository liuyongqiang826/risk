package com.hope.risk.controller.order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class OrderRelatedRiskController {

	@PostMapping("/inner/order-amt-risk")
	public void handleOrderAmtRisk(@RequestParam String orderId) {
		log.info("OrderRelatedRiskController-handleOrderAmtRisk orderId = {}", orderId);
	}
}
