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
@Table(name = "rd_changevalue")
public class RdChangevalue implements Serializable {
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

    @Column(name = "PreValue1")
    private Integer prevalue1;

    @Column(name = "PreValue2")
    private Integer prevalue2;

    @Column(name = "Remark")
    private String remark;

    private static final long serialVersionUID = 1L;
}