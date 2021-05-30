package com.cs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
