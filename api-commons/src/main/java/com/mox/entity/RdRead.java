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
@Table(name = "rd_read")
public class RdRead implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "ReadYear")
    private Integer readyear;

    @Column(name = "ReadMonth")
    private Integer readmonth;

    @Column(name = "UserNo")
    private String userno;

    @Column(name = "MeterNo")
    private String meterno;

    @Column(name = "`MaxValue`")
    private Integer maxvalue;

    @Column(name = "VolumeId")
    private Integer volumeid;

    @Column(name = "VolumeIndex")
    private Integer volumeindex;

    @Column(name = "ReadEmpID")
    private Integer readempid;

    @Column(name = "ReadDate")
    private Date readdate;

    @Column(name = "PreValue")
    private Integer prevalue;

    @Column(name = "Enter")
    private Boolean enter;

    @Column(name = "CurValue")
    private Integer curvalue;

    @Column(name = "Dial")
    private Boolean dial;

    @Column(name = "Amount")
    private Integer amount;

    @Column(name = "Formula")
    private String formula;

    @Column(name = "`Audit`")
    private Boolean audit;

    @Column(name = "AuditEmpID")
    private Integer auditempid;

    @Column(name = "AuditDate")
    private Date auditdate;

    private static final long serialVersionUID = 1L;
}