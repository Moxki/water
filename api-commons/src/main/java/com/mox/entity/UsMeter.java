package com.mox.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "us_meter")
public class UsMeter implements Serializable {
    @Id
    @Column(name = "MeterNo")
    private String meterno;

    @Column(name = "UserNo")
    private String userno;

    @Column(name = "MeterName")
    private String metername;

    @Column(name = "MeterTypeID")
    private Integer metertypeid;

    @Column(name = "`MaxValue`")
    private Integer maxvalue;

    @Column(name = "StartValue")
    private Integer startvalue;

    @Column(name = "SetupDate")
    private Date setupdate;

    @Column(name = "Factory")
    private String factory;

    @Column(name = "Disabled")
    private Boolean disabled;

    private static final long serialVersionUID = 1L;
}