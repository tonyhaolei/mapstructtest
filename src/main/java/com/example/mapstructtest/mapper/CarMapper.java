package com.example.mapstructtest.mapper;


import com.example.mapstructtest.dto.CarDto;
import com.example.mapstructtest.entity.CarDo;
import com.example.mapstrut.annotation.MapStruct;
import com.example.mapstrut.annotation.MapStructGenerate;

/**
 * TODO
 *
 * @author lei.hao
 * @date 2021/1/20
 */
@MapStruct
public interface CarMapper {

//    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);


    @MapStructGenerate(isGenerateAll = true, expandMethod = "asdasdasdas")
    CarDto carToCarDto(CarDo car);
}
