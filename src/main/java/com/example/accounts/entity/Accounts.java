package com.example.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class Accounts extends Baseentity{

    private Long customerId;
    @Id
    private Long accountNumber;

    private String accountType;

    private String branchAddress;

}
