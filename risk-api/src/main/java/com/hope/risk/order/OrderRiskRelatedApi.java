package com.hope.risk.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "risk")
public interface OrderRiskRelatedApi {

	
	@PostMapping("/inner/order-amt-risk")
	public void handleOrderAmtRisk(@RequestParam String orderId);
}
