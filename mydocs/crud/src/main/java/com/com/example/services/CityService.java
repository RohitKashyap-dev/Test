package com.com.example.services;

import java.util.List;

import com.com.example.repository.CountryRepository;
import com.com.example.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.example.dao1.CityDao;

@Service
public class CityService {

	@Autowired
	private CityDao cityDao;

	public List<City> getCitiesByCountry(int countryId) {
		return cityDao.getCitiesByCountry(countryId);
	}




}
