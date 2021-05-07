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
@Table(name = "py_bill")
public class PyBill implements Serializable {
    @Id
    @Column(name = "BillNo")
    private String billno;

    @Column(name = "ReadID")
    private Integer readid;

    @Column(name = "UserNo")
    private String userno;

    @Column(name = "CreateDate")
    private Date createdate;

    @Column(name = "BillMoney")
    private BigDecimal billmoney;

    @Column(name = "RealMoney")
    private BigDecimal realmoney;

    @Column(name = "Balance")
    private Boolean balance;

    @Column(name = "BalanceDate")
    private Date balancedate;

    private static final long serialVersionUID = 1L;
}