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
@Table(name = "be_order")
public class BeOrder implements Serializable {
    @Id
    @Column(name = "OrderNo")
    private String orderno;

    @Column(name = "OrderType")
    private Integer ordertype;

    @Column(name = "StepID")
    private Integer stepid;

    @Column(name = "CreateEmp")
    private Integer createemp;

    @Column(name = "CreateDate")
    private Date createdate;

    @Column(name = "CompleteEmp")
    private Integer completeemp;

    @Column(name = "CompleteDate")
    private Date completedate;

    @Column(name = "LastEditEmp")
    private Integer lasteditemp;

    @Column(name = "LastEditDate")
    private Date lasteditdate;

    @Column(name = "UserName")
    private String username;

    @Column(name = "UserType")
    private String usertype;

    @Column(name = "Address")
    private String address;

    @Column(name = "LinkMan")
    private String linkman;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "UseTarget")
    private String usetarget;

    @Column(name = "HouseHeight")
    private Integer househeight;

    @Column(name = "MaxAmount")
    private Integer maxamount;

    @Column(name = "MeterTypeID")
    private Integer metertypeid;

    @Column(name = "MeterCount")
    private Integer metercount;

    @Column(name = "UserRemark")
    private String userremark;

    @Column(name = "PayType")
    private String paytype;

    @Column(name = "BankCompany")
    private String bankcompany;

    @Column(name = "BankNum")
    private String banknum;

    @Column(name = "OldUserNo")
    private String olduserno;

    @Column(name = "OldUserName")
    private String oldusername;

    @Column(name = "OldUserPhone")
    private String olduserphone;

    @Column(name = "OldUserAddr")
    private String olduseraddr;

    @Column(name = "OldMeter")
    private String oldmeter;

    @Column(name = "AuditEmpID")
    private Integer auditempid;

    @Column(name = "AuditMessage")
    private String auditmessage;

    @Column(name = "ProjectMoney")
    private BigDecimal projectmoney;

    @Column(name = "RealMoney")
    private BigDecimal realmoney;

    @Column(name = "PayDate")
    private Date paydate;

    @Column(name = "ProjectDate1")
    private Date projectdate1;

    @Column(name = "ProjectDate2")
    private Date projectdate2;

    @Column(name = "AreaID")
    private Integer areaid;

    @Column(name = "AbortCause")
    private String abortcause;

    private static final long serialVersionUID = 1L;
}