package com.hospital.is.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hospital.is.StaticDatabase;
import com.hospital.is.entity.Patient;
import com.hospital.is.repository.PatientRepository;

@Repository
public class PatientRespositoryImpl implements PatientRepository {

	public List<Patient> getAll() {
		

			//return Arrays.asList("1", "2", "5");
				List<Patient> list = StaticDatabase.getPatientList();

				List<Patient> result = new ArrayList<Patient>();

				result.addAll(list);

//				result.put(1L, map.get(1L));

				return result;
			
	}

	
	
	
	

}
