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
@Table(name = "iv_invoice")
public class IvInvoice implements Serializable {
    @Id
    @Column(name = "InvoiceNo")
    private String invoiceno;

    @Column(name = "InvoiceType")
    private Integer invoicetype;

    @Column(name = "EmpID")
    private Integer empid;

    @Column(name = "InID")
    private Integer inid;

    @Column(name = "OutID")
    private Integer outid;

    @Column(name = "ArchiveID")
    private Integer archiveid;

    @Column(name = "Used")
    private Boolean used;

    @Column(name = "UseDate")
    private Date usedate;

    @Column(name = "Invalid")
    private Boolean invalid;

    @Column(name = "InvalidDate")
    private Date invaliddate;

    @Column(name = "Archived")
    private Boolean archived;

    @Column(name = "ArchiveDate")
    private Date archivedate;

    private static final long serialVersionUID = 1L;
}