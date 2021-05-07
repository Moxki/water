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
@Table(name = "us_sms")
public class UsSms implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "SendTime")
    private Date sendtime;

    @Column(name = "EmpID")
    private Integer empid;

    @Column(name = "Message")
    private String message;

    @Column(name = "Typee")
    private Integer typee;

    private static final long serialVersionUID = 1L;
}