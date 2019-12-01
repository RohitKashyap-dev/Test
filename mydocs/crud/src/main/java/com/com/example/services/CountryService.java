package com.com.example.services;

import java.util.List;

import javax.persistence.Entity;

import com.com.example.model.Country;
import com.com.example.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.example.dao1.CountryDao;



@Service
public class CountryService {

 @Autowired
 private CountryDao countryDao;

 @Autowired
 CountryRepository countryRepository;

 public List<Country> getCountriesList() {
  return countryDao.getCountriesList();
 }

 public void createCountry(Country country) {
  countryRepository.save(country);
 }
}