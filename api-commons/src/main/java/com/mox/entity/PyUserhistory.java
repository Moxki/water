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
@Table(name = "py_userhistory")
public class PyUserhistory implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "UserNo")
    private String userno;

    @Column(name = "Typee")
    private Integer typee;

    @Column(name = "OrderNo")
    private String orderno;

    @Column(name = "Datee")
    private Date datee;

    @Column(name = "PreValue")
    private Integer prevalue;

    @Column(name = "CurValue")
    private Integer curvalue;

    @Column(name = "Amount")
    private Integer amount;

    @Column(name = "BillMoney")
    private BigDecimal billmoney;

    @Column(name = "PayMoney")
    private BigDecimal paymoney;

    @Column(name = "UserMoney")
    private BigDecimal usermoney;

    private static final long serialVersionUID = 1L;
}