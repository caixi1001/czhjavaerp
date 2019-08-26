package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ChenZhihao
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Provideinfo对象", description="")
public class Provideinfo extends Model<Provideinfo> {

    private static final long serialVersionUID = 1L;

    private String peoid;

    private String peoname;

    private String peoshortname;

    private String peoascription;

    private String peopeeid;

    private String peopeename;

    private String peoarea;

    private String peoprincipal;

    private String peolinkman;

    private String peophoneone;

    private String peophonetwo;

    private String peomobilephone;

    private String peobankaccounts;

    private String peoopenbank;

    private String peoempid;

    private String peoempname;

    private String peocalling;

    private String peoemail;

    private String peoweb;

    private String peofaxes;

    private LocalDate peocreatedate;

    private String peocreditclass;

    private Double peozhangkuanedu;

    private Double peoremainedu;

    private Double peomonthreckoning;

    private Double peoqcprepaymoney;

    private Double peoqcdealmoney;

    private Double peoqmprepaymoney;

    private Double peoqmdealmoney;

    private String peoremark;

    private Integer peotrash;

    private String safetyone;

    private String safetytwo;

    private Integer enables;


    public static final String PEOID = "peoid";

    public static final String PEONAME = "peoname";

    public static final String PEOSHORTNAME = "peoshortname";

    public static final String PEOASCRIPTION = "peoascription";

    public static final String PEOPEEID = "peopeeid";

    public static final String PEOPEENAME = "peopeename";

    public static final String PEOAREA = "peoarea";

    public static final String PEOPRINCIPAL = "peoprincipal";

    public static final String PEOLINKMAN = "peolinkman";

    public static final String PEOPHONEONE = "peophoneone";

    public static final String PEOPHONETWO = "peophonetwo";

    public static final String PEOMOBILEPHONE = "peomobilephone";

    public static final String PEOBANKACCOUNTS = "peobankaccounts";

    public static final String PEOOPENBANK = "peoopenbank";

    public static final String PEOEMPID = "peoempid";

    public static final String PEOEMPNAME = "peoempname";

    public static final String PEOCALLING = "peocalling";

    public static final String PEOEMAIL = "peoemail";

    public static final String PEOWEB = "peoweb";

    public static final String PEOFAXES = "peofaxes";

    public static final String PEOCREATEDATE = "peocreatedate";

    public static final String PEOCREDITCLASS = "peocreditclass";

    public static final String PEOZHANGKUANEDU = "peozhangkuanedu";

    public static final String PEOREMAINEDU = "peoremainedu";

    public static final String PEOMONTHRECKONING = "peomonthreckoning";

    public static final String PEOQCPREPAYMONEY = "peoqcprepaymoney";

    public static final String PEOQCDEALMONEY = "peoqcdealmoney";

    public static final String PEOQMPREPAYMONEY = "peoqmprepaymoney";

    public static final String PEOQMDEALMONEY = "peoqmdealmoney";

    public static final String PEOREMARK = "peoremark";

    public static final String PEOTRASH = "peotrash";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.peoid;
    }

}
