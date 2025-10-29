package com.MN.toursProject.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class Users implements Serializable {
    public void setId(int id) {
        this.id = id;
    }

    public void setName(@NotBlank(message = "This is required !!") @Size(min = 2, max = 20, message = "Min 2 and Max 20 charcters are allowed!!") String name) {
        this.name = name;
    }

    public void setEmail(@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email!!") String email) {
        this.email = email;
    }

    public void setPassword(@NotBlank(message = "This is required !!") @Size(min = 5, message = "Password must be at least 5 characters long!!") String password) {
        this.password = password;
    }

    public void setContactNumber(@Pattern(regexp = "^[0-9]{10}$", message = "Contact number must be a valid 10-digit number!!") String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getId() {
        return id;
    }

    public @NotBlank(message = "This is required !!") @Size(min = 2, max = 20, message = "Min 2 and Max 20 charcters are allowed!!") String getName() {
        return name;
    }

    public @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email!!") String getEmail() {
        return email;
    }

    public @NotBlank(message = "This is required !!") @Size(min = 5, message = "Password must be at least 5 characters long!!") String getPassword() {
        return password;
    }

    public @Pattern(regexp = "^[0-9]{10}$", message = "Contact number must be a valid 10-digit number!!") String getContactNumber() {
        return contactNumber;
    }

    public String getRole() {
        return role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message ="This is required !!")
    @Size(min=2, max=20, message ="Min 2 and Max 20 charcters are allowed!!")
    private String name;

    @Email(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Invalid Email!!")
    @Column(unique = true)
    private String email;

    @NotBlank(message ="This is required !!")
    @Size(min=5, message ="Password must be at least 5 characters long!!")
    private String password;

    @Pattern(regexp = "^[0-9]{10}$", message = "Contact number must be a valid 10-digit number!!")
    @Column(unique = true)
    private String contactNumber;

    private String role; // ROLE_ADMIN or ROLE_CUSTOMER
    private boolean enabled;


    // Getters, setters, and other fields
}


