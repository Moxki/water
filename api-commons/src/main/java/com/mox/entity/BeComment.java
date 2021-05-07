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
@Table(name = "be_comment")
public class BeComment implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "OrderNo")
    private String orderno;

    @Column(name = "Datee")
    private Date datee;

    @Column(name = "EmpID")
    private Integer empid;

    @Column(name = "`Comment`")
    private String comment;

    private static final long serialVersionUID = 1L;
}