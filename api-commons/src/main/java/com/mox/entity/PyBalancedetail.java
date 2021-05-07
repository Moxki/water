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
@Table(name = "py_balancedetail")
public class PyBalancedetail implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "ParentID")
    private Integer parentid;

    @Column(name = "UserNo")
    private String userno;

    @Column(name = "BalanceDate")
    private Date balancedate;

    @Column(name = "BalanceMoney")
    private BigDecimal balancemoney;

    @Column(name = "BillNo")
    private String billno;

    @Column(name = "BillDetailID")
    private Integer billdetailid;

    @Column(name = "CostTypeCode")
    private String costtypecode;

    @Column(name = "DetailRealMoney1")
    private BigDecimal detailrealmoney1;

    @Column(name = "DetailRealMoney2")
    private BigDecimal detailrealmoney2;

    @Column(name = "PayNo")
    private String payno;

    @Column(name = "PayUseMoney1")
    private BigDecimal payusemoney1;

    @Column(name = "PayUseMoney2")
    private BigDecimal payusemoney2;

    private static final long serialVersionUID = 1L;
}