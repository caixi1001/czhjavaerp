package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Saleoffer对象", description="")
public class Saleoffer extends Model<Saleoffer> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据日期")
    @TableField("billDate")
    private LocalDate billDate;

    @ApiModelProperty(value = "单据号码")
    @TableId("billNo")
    private String billNo;

    @ApiModelProperty(value = "有效日期")
    @TableField("valiDate")
    private LocalDate valiDate;

    @ApiModelProperty(value = "客户ID")
    @TableField("customerID")
    private Integer customerID;

    @ApiModelProperty(value = "客户名称")
    @TableField("customerName")
    private String customerName;

    @ApiModelProperty(value = "送货地址Id")
    @TableField("addressID")
    private Integer addressID;

    @ApiModelProperty(value = "送货地址")
    @TableField("custAddress")
    private String custAddress;

    @ApiModelProperty(value = "单价是否含税1为含税2则为未税")
    @TableField("priceOfTax")
    private Integer priceOfTax;

    @ApiModelProperty(value = "币别")
    @TableField("currCurrencyName")
    private String currCurrencyName;

    @ApiModelProperty(value = "汇率")
    @TableField("exchRate")
    private Double exchRate;

    @ApiModelProperty(value = "业务人员名称")
    @TableField("salesName")
    private String salesName;

    @ApiModelProperty(value = "所属部门")
    @TableField("departID")
    private Integer departID;

    @ApiModelProperty(value = "所属部门名称")
    @TableField("departName")
    private String departName;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "备用字段1")
    private String columone;

    @ApiModelProperty(value = "备用字段2")
    private String columtow;


    public static final String BILLDATE = "billDate";

    public static final String BILLNO = "billNo";

    public static final String VALIDATE = "valiDate";

    public static final String CUSTOMERID = "customerID";

    public static final String CUSTOMERNAME = "customerName";

    public static final String ADDRESSID = "addressID";

    public static final String CUSTADDRESS = "custAddress";

    public static final String PRICEOFTAX = "priceOfTax";

    public static final String CURRCURRENCYNAME = "currCurrencyName";

    public static final String EXCHRATE = "exchRate";

    public static final String SALESNAME = "salesName";

    public static final String DEPARTID = "departID";

    public static final String DEPARTNAME = "departName";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String COLUMONE = "columone";

    public static final String COLUMTOW = "columtow";

    @Override
    protected Serializable pkVal() {
        return this.billNo;
    }

}
