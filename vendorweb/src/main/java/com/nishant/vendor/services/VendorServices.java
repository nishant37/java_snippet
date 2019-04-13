package com.nishant.vendor.services;

import java.util.List;

import com.nishant.vendor.entities.Vendor;

public interface VendorServices {

	// The below method is used to save the vendor and it will give vendor back after saving it in db.
	Vendor saveVendor(Vendor vendor);
    
	// The below method is used to update the vendor and it will give vendor back after saving it in db.
	Vendor updateVendor(Vendor vendor);
	
	// The below method is used to delete the vendor from the database.
	void deleteVendor(Vendor vendor);
	
	// The below method gets the vendor by the id
	Vendor getVendorById(int id);
	
	// The below method shows all the vendors
	List<Vendor> getAllVendors();
	
	
	
}
