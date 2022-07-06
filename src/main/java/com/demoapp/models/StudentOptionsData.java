package com.demoapp.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class StudentOptionsData {
    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;
    @Value("#{programingLanguageOptions}")
    private Map<String, String> programingLanguage;
    @Value("#{operatingSystemOptions}")
    private Map<String, String> operatingSystem;

    public Map<String, String> getCountryOptions() {
        return countryOptions;
    }

    public Map<String, String> getProgramingLanguage() {
        return programingLanguage;
    }

    public Map<String, String> getOperatingSystem() {
        return operatingSystem;
    }
}
