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
@ApiModel(value="Client对象", description="")
public class Client extends Model<Client> {

    private static final long serialVersionUID = 1L;

    private String cliid;

    private String clitypeid;

    private String cliname;

    private String clishortname;

    private String cliaddress;

    private String cliarea;

    private String cliename;

    private String clieshortname;

    private String cliprincipal;

    private String clilinkman;

    private String cliphoneone;

    private String cliphonetwo;

    private String cliphonethree;

    private String clibankaccounts;

    private String cliopenbank;

    private String empid;

    private String climobilephone;

    private String cliemail;

    private String cliweb;

    private String clifaxes;

    private LocalDate clioldoutdate;

    private LocalDate clioldintodate;

    private LocalDate clinewoutdate;

    private LocalDate clinewintodate;

    private String clidiscount;

    private String clipricestep;

    private LocalDate clicreatedate;

    private LocalDate clistopdate;

    private Double clizhangkuanedu;

    private Double cliremainedu;

    private String clicondition;

    private LocalDate climonthreckoning;

    private String clicreditstep;

    private Double cliqcdealmoney;

    private Double cliqmpremoney;

    private Double cliqmdealmoney;

    private String cliotherremark;

    private String clitrash;

    private String safetyone;

    private String safetytwo;

    private Integer enables;


    public static final String CLIID = "cliid";

    public static final String CLITYPEID = "clitypeid";

    public static final String CLINAME = "cliname";

    public static final String CLISHORTNAME = "clishortname";

    public static final String CLIADDRESS = "cliaddress";

    public static final String CLIAREA = "cliarea";

    public static final String CLIENAME = "cliename";

    public static final String CLIESHORTNAME = "clieshortname";

    public static final String CLIPRINCIPAL = "cliprincipal";

    public static final String CLILINKMAN = "clilinkman";

    public static final String CLIPHONEONE = "cliphoneone";

    public static final String CLIPHONETWO = "cliphonetwo";

    public static final String CLIPHONETHREE = "cliphonethree";

    public static final String CLIBANKACCOUNTS = "clibankaccounts";

    public static final String CLIOPENBANK = "cliopenbank";

    public static final String EMPID = "empid";

    public static final String CLIMOBILEPHONE = "climobilephone";

    public static final String CLIEMAIL = "cliemail";

    public static final String CLIWEB = "cliweb";

    public static final String CLIFAXES = "clifaxes";

    public static final String CLIOLDOUTDATE = "clioldoutdate";

    public static final String CLIOLDINTODATE = "clioldintodate";

    public static final String CLINEWOUTDATE = "clinewoutdate";

    public static final String CLINEWINTODATE = "clinewintodate";

    public static final String CLIDISCOUNT = "clidiscount";

    public static final String CLIPRICESTEP = "clipricestep";

    public static final String CLICREATEDATE = "clicreatedate";

    public static final String CLISTOPDATE = "clistopdate";

    public static final String CLIZHANGKUANEDU = "clizhangkuanedu";

    public static final String CLIREMAINEDU = "cliremainedu";

    public static final String CLICONDITION = "clicondition";

    public static final String CLIMONTHRECKONING = "climonthreckoning";

    public static final String CLICREDITSTEP = "clicreditstep";

    public static final String CLIQCDEALMONEY = "cliqcdealmoney";

    public static final String CLIQMPREMONEY = "cliqmpremoney";

    public static final String CLIQMDEALMONEY = "cliqmdealmoney";

    public static final String CLIOTHERREMARK = "cliotherremark";

    public static final String CLITRASH = "clitrash";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.cliid;
    }

}
