package br.com.events.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.events.api.domain.address.Address;

public interface AddressRepository extends JpaRepository<Address, UUID>{
    
}
