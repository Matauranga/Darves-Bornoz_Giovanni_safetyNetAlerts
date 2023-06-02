package com.safetynet.safetynetalerts.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Firestation implements Entity<Firestation> {
    @NotBlank(message = "address can not be null, empty or blank")
    private String address;
    private Integer station;

    public String getId() {
        return address; // String.valueOf(station);
    }//valeur de la station ou de l'address ?

    @Override
    public Firestation update(Firestation update) {
        this.station = update.getStation();
        return this;
    }
}
