package com.DPC.spring.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdressDto {
    private int id;

    private String ZIP;

    private String city_name;

    private String home_adress;

    private String work_adress;

    private String region;

    private String country;
}
