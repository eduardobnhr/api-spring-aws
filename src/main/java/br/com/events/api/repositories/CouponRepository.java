package br.com.events.api.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.events.api.domain.coupon.Coupon;


public interface CouponRepository extends JpaRepository<Coupon, UUID>{
    
}
