package com.cs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.model.Coupon;
import com.cs.repository.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {
	@Autowired
	private CouponRepo repo;

	@PostMapping("/coupon")
	public Coupon createCoupon(@RequestBody Coupon coupon) {

		return repo.save(coupon);
	}

	@GetMapping("/coupon/{code}")
	public Coupon getCouponByCode(@PathVariable String code) {

		return repo.findByCode(code);
	}

	@GetMapping("/coupons")
	public List<Coupon> getAllCoupons() {
		
		System.out.println("getAllCoupons() method");
		return repo.findAll();
	}

}
