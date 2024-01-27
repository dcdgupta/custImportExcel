package com.ftl.custImportExcel.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="excelcustomers")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerRef;
    private String customerName;
    private String addressLine1;
    private String  addressLine2;
    private String  town;
    private String  county;
    private String  country;
    private String postcode;
}
