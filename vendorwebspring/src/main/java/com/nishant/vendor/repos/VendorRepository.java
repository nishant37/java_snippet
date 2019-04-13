package com.nishant.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nishant.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
