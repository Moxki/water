package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "py_sumreport")
public class PySumreport implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "Typee")
    private Integer typee;

    @Column(name = "ReportYear")
    private Integer reportyear;

    @Column(name = "ReportMonth")
    private Integer reportmonth;

    @Column(name = "`LineNo`")
    private Integer lineno;

    @Column(name = "C1")
    private String c1;

    @Column(name = "C2")
    private String c2;

    @Column(name = "C3")
    private String c3;

    @Column(name = "C4")
    private String c4;

    @Column(name = "C5")
    private String c5;

    private static final long serialVersionUID = 1L;
}