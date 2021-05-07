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
@Table(name = "be_orderlite")
public class BeOrderlite implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "OrderType")
    private Integer ordertype;

    @Column(name = "Datee")
    private Date datee;

    @Column(name = "EmpID")
    private Integer empid;

    @Column(name = "UserNo")
    private String userno;

    @Column(name = "UserName")
    private String username;

    @Column(name = "Description")
    private String description;

    private static final long serialVersionUID = 1L;
}