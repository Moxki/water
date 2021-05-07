package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rd_readtypes")
public class RdReadtypes implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "ReadID")
    private Integer readid;

    @Column(name = "UserNo")
    private String userno;

    @Column(name = "WaterTypeCode")
    private String watertypecode;

    @Column(name = "AllotText")
    private String allottext;

    @Column(name = "Amount")
    private Integer amount;

    private static final long serialVersionUID = 1L;
}