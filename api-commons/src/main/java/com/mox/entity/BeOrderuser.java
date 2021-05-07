package com.mox.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "be_orderuser")
public class BeOrderuser implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "OrderNo")
    private String orderno;

    @Column(name = "UserName")
    private String username;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "SMSPhone")
    private String smsphone;

    @Column(name = "Address")
    private String address;

    @Column(name = "ProjectMoney")
    private BigDecimal projectmoney;

    @Column(name = "RealMoney")
    private BigDecimal realmoney;

    @Column(name = "InvoiceNo")
    private String invoiceno;

    @Column(name = "Formula")
    private String formula;

    @Column(name = "ContractNum")
    private String contractnum;

    @Column(name = "MeterTypeID")
    private Integer metertypeid;

    @Column(name = "MeterName")
    private String metername;

    @Column(name = "`MaxValue`")
    private Integer maxvalue;

    @Column(name = "StartValue")
    private Integer startvalue;

    @Column(name = "MeterFactory")
    private String meterfactory;

    @Column(name = "DocNum")
    private String docnum;

    @Column(name = "UserNo")
    private String userno;

    private static final long serialVersionUID = 1L;
}