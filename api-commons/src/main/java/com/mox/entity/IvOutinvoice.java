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
@Table(name = "iv_outinvoice")
public class IvOutinvoice implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "EmpID")
    private Integer empid;

    @Column(name = "InID")
    private Integer inid;

    @Column(name = "StartNo")
    private String startno;

    @Column(name = "EndNo")
    private String endno;

    @Column(name = "Counts")
    private Integer counts;

    @Column(name = "OutDate")
    private Date outdate;

    @Column(name = "OutEmpID")
    private Integer outempid;

    private static final long serialVersionUID = 1L;
}