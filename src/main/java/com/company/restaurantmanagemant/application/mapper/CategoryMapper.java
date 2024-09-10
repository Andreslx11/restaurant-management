package com.company.restaurantmanagemant.application.mapper;

// MapStruct annotations

import com.company.restaurantmanagemant.application.dto.category.CategoryBodyDto;
import com.company.restaurantmanagemant.application.dto.category.CategoryDto;
import com.company.restaurantmanagemant.application.dto.category.CategorySmallDto;
import com.company.restaurantmanagemant.persistence.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;


@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING
//        uses = {StateMapper.class}
)
public interface CategoryMapper {

    /*
    *  Mapstruct va inferir los campos de los dto realizando el mapeo,
    * si el nombre de los campos fuera deferente toca especificar
    *  Mapping( source= name , target = name)
    * */



    // Para mostrar la información que recuperamos de la base datos
    // como tienen los mismo nombres los campos no necesitamo
    // Mapping( source= name , target = name)

    CategoryDto toDto(Category category);

    CategorySmallDto toSmallDto(Category category);




//    CategorySavedDto toSavedDto(Category category);


    Category toEntity(CategoryBodyDto categoryBody);

  //  Category updateEntity(@MappingTarget Category category, CategoryBodyDto categoryBody);
}
