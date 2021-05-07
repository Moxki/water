package com.mox.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "py_billdetail")
public class PyBilldetail implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "BillNo")
    private String billno;

    @Column(name = "UserNo")
    private String userno;

    @Column(name = "CostTypeCode")
    private String costtypecode;

    @Column(name = "Amount")
    private Integer amount;

    @Column(name = "Price")
    private BigDecimal price;

    @Column(name = "DetailMoney")
    private BigDecimal detailmoney;

    @Column(name = "RealMoney")
    private BigDecimal realmoney;

    @Column(name = "Balance")
    private Boolean balance;

    @Column(name = "BalanceDate")
    private Date balancedate;

    private static final long serialVersionUID = 1L;
}