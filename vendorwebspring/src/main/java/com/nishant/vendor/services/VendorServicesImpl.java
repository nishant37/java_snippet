package com.nishant.vendor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nishant.vendor.entities.Vendor;
import com.nishant.vendor.repos.VendorRepository;

@Service
public class VendorServicesImpl implements VendorServices {

	@Autowired
	private VendorRepository repository;
	
	@Override
	public Vendor saveVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		repository.delete(vendor);

	}

	@Override
	public Vendor getVendorById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public VendorRepository getReposoitory() {
		return repository;
	}

	public void setReposoitory(VendorRepository reposoitory) {
		this.repository = reposoitory;
	}

}
