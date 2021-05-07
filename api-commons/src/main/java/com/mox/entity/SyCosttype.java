package com.mox.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sy_costtype")
public class SyCosttype implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "Kind")
    private Integer kind;

    @Column(name = "Code")
    private String code;

    @Column(name = "CostTypeName")
    private String costtypename;

    @Column(name = "FullName")
    private String fullname;

    @Column(name = "Price")
    private BigDecimal price;

    @Column(name = "SurchargeText")
    private String surchargetext;

    @Column(name = "Remark")
    private String remark;

    @Column(name = "Disabled")
    private Boolean disabled;

    private static final long serialVersionUID = 1L;
}