package com.kadiryuksel.controller;

import com.kadiryuksel.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
    //@ResponseBody
    public String getThymeleaf1() {
        return "thymeleaf1";
    }

    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model(Model model) {
        model.addAttribute("key_model", "example model value");
        model.addAttribute("key_model2", "example model value-2");
        return "thymeleaf1";
    }

    //http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3Model(Model model) {
        model.addAttribute("key_model", "example model value");
        model.addAttribute("key_model2", "example model value-3");
        return "thymeleaf_file/thymeleaf3";
    }

    //http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4Model(Model model) {
        model.addAttribute("key_model", "example model value-4");
        return "thymeleaf4";
    }

    //http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5")
    public String getThymeleaf5ModelObject(Model model) {
        model.addAttribute("key_model", "text");
        ProductDto productDto = ProductDto
                .builder()
                .productId(0L)
                .productName("TEST NAME")
                .productPrice(2500)
                .build();
        model.addAttribute("key_model2", productDto);
        return "thymeleaf5";
    }

    //http://localhost:8080/thymeleaf6
    @GetMapping("/thymeleaf6")
    public String getThymeleaf6ModelObjectList(Model model) {
        model.addAttribute("key_model", "text");
        List<ProductDto> productDtos = new ArrayList<>();
        productDtos.add(ProductDto.builder().productId(0L).productName("TEST NAME-1").productPrice(2500).build());
        productDtos.add(ProductDto.builder().productId(1L).productName("TEST NAME-2").productPrice(3500).build());
        productDtos.add(ProductDto.builder().productId(2L).productName("TEST NAME-3").productPrice(4500).build());

        model.addAttribute("productDtos", productDtos);
        return "thymeleaf6";
    }
}
