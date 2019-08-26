package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 采购询价主表
 * </p>
 *
 * @author ChenZhihao
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Stockinquire对象", description="采购询价主表")
public class Stockinquire extends Model<Stockinquire> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标识列")
    private Integer flag;

    @ApiModelProperty(value = "供应商")
    @TableField("customerName")
    private String customerName;

    @ApiModelProperty(value = "伪外键(供应商主文件)")
    @TableField("customerID")
    private Integer customerID;

    @ApiModelProperty(value = "供应商地址")
    @TableField("custAddress")
    private String custAddress;

    @ApiModelProperty(value = "单据号码")
    @TableField("billNo")
    private String billNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("billDate")
    private LocalDate billDate;

    @ApiModelProperty(value = "有效日期")
    @TableField("validDate")
    private LocalDate validDate;

    @ApiModelProperty(value = "是否含税(含税/未含税)")
    @TableField("priceOfTax")
    private Integer priceOfTax;

    @ApiModelProperty(value = "汇率")
    @TableField("exchRate")
    private Integer exchRate;

    @ApiModelProperty(value = "送货地址")
    @TableField("outAddress")
    private String outAddress;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "采购人员")
    @TableField("salesName")
    private String salesName;

    @ApiModelProperty(value = "伪外键(请购人员外键)")
    @TableField("salesID")
    private Integer salesID;

    @ApiModelProperty(value = "所属部门")
    @TableField("departName")
    private String departName;

    @ApiModelProperty(value = "伪外键(所属部门外键)")
    @TableField("departID")
    private Integer departID;

    @ApiModelProperty(value = "审核状态：未审核/已审核/无效")
    private Integer permittering;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段1")
    private String safetyone;

    @ApiModelProperty(value = "保留字段2")
    private String safetytwo;


    public static final String FLAG = "flag";

    public static final String CUSTOMERNAME = "customerName";

    public static final String CUSTOMERID = "customerID";

    public static final String CUSTADDRESS = "custAddress";

    public static final String BILLNO = "billNo";

    public static final String BILLDATE = "billDate";

    public static final String VALIDDATE = "validDate";

    public static final String PRICEOFTAX = "priceOfTax";

    public static final String EXCHRATE = "exchRate";

    public static final String OUTADDRESS = "outAddress";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String SALESNAME = "salesName";

    public static final String SALESID = "salesID";

    public static final String DEPARTNAME = "departName";

    public static final String DEPARTID = "departID";

    public static final String PERMITTERING = "permittering";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.flag;
    }

}
