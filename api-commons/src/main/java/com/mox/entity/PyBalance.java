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
@Table(name = "py_balance")
public class PyBalance implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "UserNo")
    private String userno;

    @Column(name = "BalanceDate")
    private Date balancedate;

    @Column(name = "BalanceMoney")
    private BigDecimal balancemoney;

    @Column(name = "BillNo")
    private String billno;

    @Column(name = "BillRealMoney1")
    private BigDecimal billrealmoney1;

    @Column(name = "BillRealMoney2")
    private BigDecimal billrealmoney2;

    @Column(name = "PayNo")
    private String payno;

    @Column(name = "PayUseMoney1")
    private BigDecimal payusemoney1;

    @Column(name = "PayUseMoney2")
    private BigDecimal payusemoney2;

    private static final long serialVersionUID = 1L;
}