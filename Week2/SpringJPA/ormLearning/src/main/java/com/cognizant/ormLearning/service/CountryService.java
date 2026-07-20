package com.cognizant.ormLearning.service;

import com.cognizant.ormLearning.exception.CountryNotFoundException;
import com.cognizant.ormLearning.model.Country;
import com.cognizant.ormLearning.repository.CountryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    @Transactional(readOnly = true)
    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Country findCountryByCode(String countryCode)
        throws CountryNotFoundException{
        Optional<Country> result = countryRepository.findById(countryCode);

        if(result.isEmpty()){
            throw new CountryNotFoundException(
                    "Country not found with code: "+countryCode
            );
        }

        return result.get();
    }

    @Transactional
    public void addCountry(Country country){
        countryRepository.save(country);
    }

    @Transactional
    public void updateCountry(String code, String name)
            throws CountryNotFoundException {

        Country country = findCountryByCode(code);

        country.setName(name);

        countryRepository.save(country);
    }

    @Transactional
    public void deleteCountry(String code) {

        countryRepository.deleteById(code);

    }

    @Transactional(readOnly = true)
    public List<Country> searchCountry(String text) {

        return countryRepository.findByNameContainingIgnoreCase(text);

    }

    @Transactional(readOnly = true)
    public List<Country> getAllCountriesHQL() {

        return countryRepository.getAllCountriesHQL();

    }

    @Transactional(readOnly = true)
    public Country getCountryByCodeHQL(String code) {

        return countryRepository.getCountryByCodeHQL(code);

    }

    @Transactional(readOnly = true)
    public List<Country> getAllCountriesNative() {

        return countryRepository.getAllCountriesNative();

    }

    @Transactional(readOnly = true)
    public Country getCountryNative(String code) {

        return countryRepository.getCountryNative(code);

    }
}
