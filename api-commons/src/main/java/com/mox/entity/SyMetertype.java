package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sy_metertype")
public class SyMetertype implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "MeterTypeName")
    private String metertypename;

    @Column(name = "Aperture")
    private Integer aperture;

    @Column(name = "MavValue")
    private Integer mavvalue;

    @Column(name = "`MinValue`")
    private Integer minvalue;

    @Column(name = "Life")
    private Integer life;

    @Column(name = "Remark")
    private String remark;

    @Column(name = "Disabled")
    private Boolean disabled;

    private static final long serialVersionUID = 1L;
}