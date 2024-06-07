package com.xworkz.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.dto.ProductDto;
import com.xworkz.requestDto.RequestProductDto;
import com.xworkz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;
import java.util.Optional;

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
    public String findProduct(@RequestParam Integer itemId,Model model){

        System.out.println("find product by the id :"+itemId);

        try{
            Optional<ProductDto> productDtoOptional = productService.findById(itemId);

            if(productDtoOptional.isPresent()){
                model.addAttribute("dto",productDtoOptional.get());
                model.addAttribute("successMsg","Data found successfully for id :"+itemId);
            }else{
                model.addAttribute("errorMsg","Data not found for id :"+itemId);
            }
        }catch (IllegalArgumentException e){
            model.addAttribute("errorMsg",e.getMessage());
        }


        return "pages/FindProduct";
    }


    @GetMapping("/currentStock")
    public String findProductByCurrentStock(@RequestParam(required = false) Integer currentStock,Model model){

        System.out.println("find product by the current Stock :"+currentStock);

        try{
            Optional<List<ProductDto>> productDtoOptional = productService.findByCurrentStock(currentStock);

            if(productDtoOptional.isPresent() && !productDtoOptional.get().isEmpty()){
                model.addAttribute("list",productDtoOptional.get());
                model.addAttribute("successMsg","Data found successfully for current Stock : "+currentStock);
            }else{
                model.addAttribute("errorMsg","Data not found for current Stock : "+currentStock);
            }
        }catch (IllegalArgumentException e){
            model.addAttribute("errorMsg",e.getMessage());
        }


        return "pages/FindProductByCurrentStock";
    }

}
