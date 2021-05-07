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
@Table(name = "py_pay")
public class PyPay implements Serializable {
    @Id
    @Column(name = "PayNo")
    private String payno;

    @Column(name = "UserNo")
    private String userno;

    @Column(name = "PayType")
    private String paytype;

    @Column(name = "PayDate")
    private Date paydate;

    @Column(name = "Invoice")
    private String invoice;

    @Column(name = "PayMoney")
    private BigDecimal paymoney;

    @Column(name = "UseMoney")
    private BigDecimal usemoney;

    @Column(name = "EmpID")
    private Integer empid;

    private static final long serialVersionUID = 1L;
}