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
@Table(name = "us_user")
public class UsUser implements Serializable {
    @Id
    @Column(name = "UserNo")
    private String userno;

    @Column(name = "UserName")
    private String username;

    @Column(name = "ABC")
    private String abc;

    @Column(name = "CreateDate")
    private Date createdate;

    @Column(name = "Address")
    private String address;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "SMSPhone")
    private String smsphone;

    @Column(name = "AreaID")
    private Integer areaid;

    @Column(name = "UserType")
    private String usertype;

    @Column(name = "PayType")
    private String paytype;

    @Column(name = "BankName")
    private String bankname;

    @Column(name = "BankNum")
    private String banknum;

    @Column(name = "Formula")
    private String formula;

    @Column(name = "UserMoney")
    private BigDecimal usermoney;

    @Column(name = "MeterID")
    private Integer meterid;

    @Column(name = "DocNum")
    private String docnum;

    @Column(name = "Pwd")
    private String pwd;

    @Column(name = "ContractNum")
    private String contractnum;

    @Column(name = "ContractDate")
    private Date contractdate;

    @Column(name = "VolumeID")
    private Integer volumeid;

    @Column(name = "VolumeOrderIndex")
    private Integer volumeorderindex;

    @Column(name = "Disabled")
    private Boolean disabled;

    private static final long serialVersionUID = 1L;
}