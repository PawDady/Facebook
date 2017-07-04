package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class City {
    private String countryName;
    private String cityName;
    private String stateName;
    private Coord coords;
}