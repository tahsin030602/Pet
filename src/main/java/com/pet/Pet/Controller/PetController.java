package com.pet.Pet.Controller;

import com.pet.Pet.Model.Pet;
import com.pet.Pet.Service.PetService;
import jakarta.mail.Multipart;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/address")
public class PetController {
    private PetService petService;
//    @PostMapping("/add")
//    public String add(@RequestPart Pet pet,
//                      @RequestPart List<MultipartFile> multipartFiles,
//                      @RequestParam Long animal_id,
//                      @RequestParam List<Long> category_ids,
//                      @RequestParam Long address_id){
//        return petService.addPet(pet,multipartFiles,animal_id,category_ids,address_id);
//
//    }
}
