package com.setxpro.gerency.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AutorService {

    private final String API_URL = "https://restcountries.com/v3.1/name/";

    private final RestTemplate restTemplate;

    @Autowired
    public AutorService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }







    // Verify if country exists
    public boolean doesCountryExists(String countryName) {
        String apiUrl = API_URL + countryName;

        try {
            restTemplate.getForObject(apiUrl, Object.class);
            return true;
        } catch (Exception e) {
            return  false;
        }
    }
}
