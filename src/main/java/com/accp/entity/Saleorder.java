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
@ApiModel(value="Saleorder对象", description="")
public class Saleorder extends Model<Saleorder> {

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

    @ApiModelProperty(value = "客户")
    @TableField("customerID")
    private String customerID;

    @ApiModelProperty(value = "客户名称")
    @TableField("customerName")
    private String customerName;

    @ApiModelProperty(value = "客户订单")
    @TableField("custBillNo")
    private String custBillNo;

    @ApiModelProperty(value = "送货地址Id")
    @TableField("addressID")
    private Integer addressID;

    @ApiModelProperty(value = "送货地址")
    @TableField("custAddress")
    private String custAddress;

    @ApiModelProperty(value = "单价是否含税1为含税2则为未税")
    @TableField("priceOfTax")
    private Integer priceOfTax;

    @ApiModelProperty(value = "单况1为未结案2为已结案3为无效")
    @TableField("billStatus")
    private Integer billStatus;

    @ApiModelProperty(value = "销售订单类型ID")
    @TableField("billStyleID")
    private Integer billStyleID;

    @ApiModelProperty(value = "销售订单类型名称")
    @TableField("billStyleName")
    private String billStyleName;

    @ApiModelProperty(value = "币别")
    @TableField("currCurrencyName")
    private String currCurrencyName;

    @ApiModelProperty(value = "汇率")
    @TableField("exchRate")
    private Double exchRate;

    @ApiModelProperty(value = "账款归属")
    @TableField("custFundsAttribution")
    private String custFundsAttribution;

    @ApiModelProperty(value = "收款条件")
    @TableField("catherStyle")
    private String catherStyle;

    @ApiModelProperty(value = "收款日期")
    @TableField("prepayDay")
    private LocalDate prepayDay;

    @ApiModelProperty(value = "收款天数")
    @TableField("gatherDelay")
    private Integer gatherDelay;

    @ApiModelProperty(value = "账款月份")
    @TableField("accMonth")
    private LocalDate accMonth;

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

    public static final String CUSTBILLNO = "custBillNo";

    public static final String ADDRESSID = "addressID";

    public static final String CUSTADDRESS = "custAddress";

    public static final String PRICEOFTAX = "priceOfTax";

    public static final String BILLSTATUS = "billStatus";

    public static final String BILLSTYLEID = "billStyleID";

    public static final String BILLSTYLENAME = "billStyleName";

    public static final String CURRCURRENCYNAME = "currCurrencyName";

    public static final String EXCHRATE = "exchRate";

    public static final String CUSTFUNDSATTRIBUTION = "custFundsAttribution";

    public static final String CATHERSTYLE = "catherStyle";

    public static final String PREPAYDAY = "prepayDay";

    public static final String GATHERDELAY = "gatherDelay";

    public static final String ACCMONTH = "accMonth";

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
