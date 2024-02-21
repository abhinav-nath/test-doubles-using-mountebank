package com.codecafe.mbdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CurrencyConversionService {

  @Autowired
  private RestTemplate restTemplate;

  @Value("${currency.rates.service.url}")
  private String serviceUrl;

  public String convert(double amount, String from, String to) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(serviceUrl + "/rates")
      .queryParam("from", from)
      .queryParam("to", to);
    double rate = restTemplate.getForObject(uriBuilder.toUriString(), Double.class);

    double convertedAmount = amount * rate;
    return String.format("%.2f %s = %.2f %s", amount, from, convertedAmount, to);
  }

}
