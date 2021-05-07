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
@Table(name = "rd_yearmonth")
public class RdYearmonth implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "ReadYear")
    private Integer readyear;

    @Column(name = "ReadMonth")
    private Integer readmonth;

    @Column(name = "IsCurrent")
    private Boolean iscurrent;

    @Column(name = "InitEmpID")
    private Integer initempid;

    @Column(name = "InitDate")
    private Date initdate;

    @Column(name = "EndDate")
    private Integer enddate;

    private static final long serialVersionUID = 1L;
}