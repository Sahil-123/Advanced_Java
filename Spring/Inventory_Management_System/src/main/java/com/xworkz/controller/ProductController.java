package com.xworkz.controller;

import com.xworkz.dto.ProductDto;
import com.xworkz.requestDto.RequestProductDto;
import com.xworkz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public String saveProduct(@Valid RequestProductDto requestProductDto, BindingResult bindingResult, Model model){

        System.out.println("product saving is under process."+requestProductDto);

        if(bindingResult.hasErrors()){
            model.addAttribute("errors",bindingResult.getAllErrors());
        }else{

            if(productService.save(requestProductDto)){
                System.out.println("product saved successfully");
                model.addAttribute("msg","Product is saved successfully");
                return "pages/Success";
            }else{
                System.out.println("Product is not saved successfully");
                model.addAttribute("msg","Product is not saved successfully");
            }
        }

        model.addAttribute("dto",requestProductDto);
        return "pages/ProductRegister";
    }

    @GetMapping("/find")
    public String findProduct(){


        return "FindProduct";
    }

}
