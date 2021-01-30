package es.byb.web.pricefactory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/prices")
public class PriceController {

    @GetMapping(path = "/price")
    public Double getPriceByProduct(@RequestParam final String productCode) {

        System.out.println("Responding price for product code = " + productCode);
        return 12.36;
    }
}
