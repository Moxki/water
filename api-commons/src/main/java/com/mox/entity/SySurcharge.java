package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sy_surcharge")
public class SySurcharge implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "SurchargeID")
    private Integer surchargeid;

    @Column(name = "WaterTypeID")
    private Integer watertypeid;

    private static final long serialVersionUID = 1L;
}