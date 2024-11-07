package com.pet.Pet.Service;

import com.pet.Pet.Model.Animal;
import com.pet.Pet.Model.Category;
import com.pet.Pet.Model.Pet;
import com.pet.Pet.Model.Users;
import com.pet.Pet.Repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class PetService {
    @Autowired
    private FirebaseService firebaseService;
    @Autowired
    private AnimalRepo animalRepo;
    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private PetRepo petRepo;
    @Autowired
    private UsersRepo usersRepo;
    @Autowired
    private AddressRepo addressRepo;

//    public String addPet(Pet pet, List<MultipartFile> multipartFiles, Long animalId, List<Long> categoryIds, Long addressId) throws IOException {
//        List<String> urls = firebaseService.uploadFiles(multipartFiles);
//        pet.setMedia(urls);
//
//        Animal animal = animalRepo.findById(animalId).orElseThrow(() -> new RuntimeException("Animal not found"));
//        pet.setAnimal(animal);
//        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        Users user = usersRepo.findByUsername(userDetails.getUsername());
//        pet.setOwner(user);
//        pet.setAddress((addressId != null ? addressRepo.findById(addressId).orElse(null) : user.getAddress()));
//
//        for (Long categoryId : categoryIds) {
//            Category category = (Category) categoryRepo.findById(categoryId).orElse(null);
//            if (category == null) continue;
//            pet.getCategories().add(category);
//        }
//        pet.setReportCount(0L);
//
//    }
}
