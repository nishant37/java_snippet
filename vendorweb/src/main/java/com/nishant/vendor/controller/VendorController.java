package com.nishant.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.nishant.vendor.entities.Vendor;
import com.nishant.vendor.services.VendorServices;

@Controller
public class VendorController {
	
	@Autowired
	VendorServices service;

	@RequestMapping("/showVendors")
	public String showVendors() {
		return "createVendor";
	}
	
	
	@RequestMapping("/saveVendor")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
	Vendor vendorSaved  = service.saveVendor(vendor);
	String msg = "Vendor saved with Id: "+vendorSaved.getId();
	modelMap.addAttribute("msg",msg);
		return "createVendor";
	}
	
	@RequestMapping("/displayVendors")
	public String displayVendors(ModelMap modelMap) {
		List<Vendor> vendor =  service.getAllVendors();
		modelMap.addAttribute("vendor",vendor);
		return "displayVendors";
	}
	
	@RequestMapping("deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
		//Location location =service.getLocationById(id);
		Vendor vendors = new Vendor();
		vendors.setId(id);
		service.deleteVendor(vendors);
		List<Vendor> vendor = service.getAllVendors();
		modelMap.addAttribute("vendor", vendor);
		return "displayVendors";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
	Vendor vendor= 	service.getVendorById(id);
	modelMap.addAttribute("vendor", vendor);
		return "updateVendor";
	}
	
	
	@RequestMapping("/updateVendor")
	public String updateVendor(@ModelAttribute("vendor") Vendor vendors, ModelMap modelMap) {
		service.updateVendor(vendors);
		List<Vendor> vendor = service.getAllVendors();
		modelMap.addAttribute("vendor", vendor);
		return "displayVendors";
	}
	
}
