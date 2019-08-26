package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="Copewith对象", description="")
public class Copewith extends Model<Copewith> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "供应商id")
    @TableId("customerId")
    private String customerId;

    @ApiModelProperty(value = "结算一")
    private Double cash;

    @ApiModelProperty(value = "结算二")
    private Double visa;

    @ApiModelProperty(value = "结算三")
    @TableField("otherPay")
    private Double otherPay;

    @ApiModelProperty(value = "结算方式名称1")
    @TableField("cashStyleName")
    private String cashStyleName;

    @ApiModelProperty(value = "结算方式名称2")
    @TableField("visaStyleName")
    private String visaStyleName;

    @ApiModelProperty(value = "结算方式名称3")
    @TableField("otherPayStyleID")
    private String otherPayStyleID;

    @ApiModelProperty(value = "单据号码")
    @TableField("fundBillNo")
    private String fundBillNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("billDate")
    private LocalDateTime billDate;

    @ApiModelProperty(value = "币别id")
    @TableField("rcurrencyId")
    private Integer rcurrencyId;

    @ApiModelProperty(value = "币别名称")
    @TableField("rcurrencyName")
    private String rcurrencyName;

    @ApiModelProperty(value = "汇率")
    @TableField("exchRate")
    private String exchRate;

    @ApiModelProperty(value = "应付冲款类型")
    @TableField("offSetStyle")
    private Double offSetStyle;

    @ApiModelProperty(value = "凭证编号")
    private String proofnumber;

    @ApiModelProperty(value = "终止张月")
    @TableField("accMonthToMonth")
    private LocalDateTime accMonthToMonth;

    @ApiModelProperty(value = "折扣率")
    @TableField("discountPer")
    private Double discountPer;

    @ApiModelProperty(value = "所属部门")
    @TableField("deptFrom")
    private String deptFrom;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "所属项目")
    private String project;

    private String beiyony;

    private String beiyonr;

    private String beiyons;

    private String beiyonf;

    private String beiyonw;


    public static final String CUSTOMERID = "customerId";

    public static final String CASH = "cash";

    public static final String VISA = "visa";

    public static final String OTHERPAY = "otherPay";

    public static final String CASHSTYLENAME = "cashStyleName";

    public static final String VISASTYLENAME = "visaStyleName";

    public static final String OTHERPAYSTYLEID = "otherPayStyleID";

    public static final String FUNDBILLNO = "fundBillNo";

    public static final String BILLDATE = "billDate";

    public static final String RCURRENCYID = "rcurrencyId";

    public static final String RCURRENCYNAME = "rcurrencyName";

    public static final String EXCHRATE = "exchRate";

    public static final String OFFSETSTYLE = "offSetStyle";

    public static final String PROOFNUMBER = "proofnumber";

    public static final String ACCMONTHTOMONTH = "accMonthToMonth";

    public static final String DISCOUNTPER = "discountPer";

    public static final String DEPTFROM = "deptFrom";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String PROJECT = "project";

    public static final String BEIYONY = "beiyony";

    public static final String BEIYONR = "beiyonr";

    public static final String BEIYONS = "beiyons";

    public static final String BEIYONF = "beiyonf";

    public static final String BEIYONW = "beiyonw";

    @Override
    protected Serializable pkVal() {
        return this.customerId;
    }

}
