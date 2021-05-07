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
@Table(name = "rd_changemaxvalue")
public class RdChangemaxvalue implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "Datee")
    private Date datee;

    @Column(name = "EmpID")
    private Integer empid;

    @Column(name = "UserNo")
    private String userno;

    @Column(name = "MeterNo")
    private String meterno;

    @Column(name = "MaxValue1")
    private Integer maxvalue1;

    @Column(name = "MaxValue2")
    private Integer maxvalue2;

    @Column(name = "Remark")
    private String remark;

    private static final long serialVersionUID = 1L;
}