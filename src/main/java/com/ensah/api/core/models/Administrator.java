package com.ensah.api.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Administrator extends User {

    private int phoneNumber;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "absController")
    private Set<Surveillance> surveillances;

}