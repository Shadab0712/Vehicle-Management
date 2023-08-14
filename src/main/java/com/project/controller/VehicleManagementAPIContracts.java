package com.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.dto.VehicleDTO;

public interface VehicleManagementAPIContracts {
	
	@PostMapping ("/api/v1/vehicle")
	public ResponseEntity<String> createVehile(@RequestBody VehicleDTO vehicledDTO);
	
	@GetMapping("/api/v1/vehicle/{vehicleId}")
	public ResponseEntity <VehileDTO> getVehicle(@PathVariable long vehicleId);
	
	@PutMapping("/api/v1/vehicle/{vehicleId}")
	public ResponseEntity <VehicleDTO> updateVehicle(@PathVariable long vehicleId , @RequestBody VehicleDTO vehicleDTO )

	@DeleteMapping("/api/v1/vehicle/{vehicleId}")
	public ResponseEntity<String> deleteVehicle(@PathVariable long vehicleId);
}
