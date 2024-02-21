package com.codecafe.mbdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codecafe.mbdemo.service.CurrencyConversionService;

@RestController
@RequestMapping("/convert")
public class CurrencyConversionController {

  @Autowired
  private CurrencyConversionService currencyConversionService;

  @GetMapping
  public String convertCurrency(@RequestParam("amount") double amount,
                                @RequestParam("from") String from,
                                @RequestParam("to") String to) {
    return currencyConversionService.convert(amount, from, to);
  }

}
