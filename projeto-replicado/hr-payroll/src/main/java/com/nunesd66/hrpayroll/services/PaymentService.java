package com.nunesd66.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.nunesd66.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.00, days);
	}
	
}
