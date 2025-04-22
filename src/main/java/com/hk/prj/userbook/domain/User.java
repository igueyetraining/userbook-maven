package com.hk.prj.userbook.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity(name = "user_details")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 2, message = "first name should have atleast 2 characters")
    private String firstName;
    @NotEmpty(message = "last name can't be empty")
    private String lastName;
    @NotEmpty @Email
    private String email;
//    @NotEmpty
//    private String gender;
    @NotEmpty @Size(min = 2, message = "Valid city name required with atleast 2 characters")
    private String city;
    @NotEmpty @Size(min = 2, message = "Valid country name required with atleast 2 characters")
    private String country;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
