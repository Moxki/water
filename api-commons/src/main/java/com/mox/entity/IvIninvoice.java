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
@Table(name = "iv_ininvoice")
public class IvIninvoice implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "InvoiceType")
    private Integer invoicetype;

    @Column(name = "StartNo")
    private String startno;

    @Column(name = "EndNo")
    private String endno;

    @Column(name = "Counts")
    private Integer counts;

    @Column(name = "InDate")
    private Date indate;

    @Column(name = "InEmpID")
    private Integer inempid;

    private static final long serialVersionUID = 1L;
}