package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "be_formula")
public class BeFormula implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "OrderUserID")
    private Integer orderuserid;

    @Column(name = "WaterTypeCode")
    private String watertypecode;

    @Column(name = "AllotText")
    private String allottext;

    @Column(name = "AllotType")
    private Integer allottype;

    @Column(name = "AllotValue")
    private Integer allotvalue;

    private static final long serialVersionUID = 1L;
}