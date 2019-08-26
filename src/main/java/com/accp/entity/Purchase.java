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
@ApiModel(value="Purchase对象", description="")
public class Purchase extends Model<Purchase> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("fundBillNo")
    private String fundBillNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("billDate")
    private LocalDateTime billDate;

    @ApiModelProperty(value = "供应商id")
    @TableField("custId")
    private String custId;

    @ApiModelProperty(value = "发票号码")
    @TableField("invoiceNo")
    private String invoiceNo;

    @ApiModelProperty(value = "币别id")
    @TableField("currId")
    private String currId;

    @ApiModelProperty(value = "汇率")
    @TableField("exchRate")
    private String exchRate;

    @ApiModelProperty(value = "所属部门id")
    @TableField("deptId")
    private String deptId;

    @ApiModelProperty(value = "部门名称")
    @TableField("deptName")
    private String deptName;

    @ApiModelProperty(value = "所属项目id")
    @TableField("projectID")
    private String projectID;

    @ApiModelProperty(value = "项目名称")
    @TableField("projectName")
    private String projectName;

    @ApiModelProperty(value = "采购人员id")
    private Integer salesmanid;

    @ApiModelProperty(value = "采购人员姓名")
    @TableField("personName")
    private String personName;

    @ApiModelProperty(value = "单价是否含税")
    @TableField("priceOfTax")
    private String priceOfTax;

    @ApiModelProperty(value = "凭证编号")
    @TableField("voucherNo")
    private String voucherNo;

    @ApiModelProperty(value = "差价凭证编号")
    @TableField("cVoucherNo")
    private String cVoucherNo;

    @ApiModelProperty(value = "采购核对状态")
    @TableField("affirmState")
    private String affirmState;

    @ApiModelProperty(value = "单据类型")
    @TableField("bllType")
    private String bllType;

    @ApiModelProperty(value = "制单人员签名")
    @TableField("kerSign")
    private String kerSign;

    @ApiModelProperty(value = "复核人签名")
    @TableField("permitterSign")
    private String permitterSign;

    private String beiyon;

    private String beiyonr;

    private String beiyons;

    private String beiyonf;

    private String beiyonw;

    private String beiyonl;


    public static final String FUNDBILLNO = "fundBillNo";

    public static final String BILLDATE = "billDate";

    public static final String CUSTID = "custId";

    public static final String INVOICENO = "invoiceNo";

    public static final String CURRID = "currId";

    public static final String EXCHRATE = "exchRate";

    public static final String DEPTID = "deptId";

    public static final String DEPTNAME = "deptName";

    public static final String PROJECTID = "projectID";

    public static final String PROJECTNAME = "projectName";

    public static final String SALESMANID = "salesmanid";

    public static final String PERSONNAME = "personName";

    public static final String PRICEOFTAX = "priceOfTax";

    public static final String VOUCHERNO = "voucherNo";

    public static final String CVOUCHERNO = "cVoucherNo";

    public static final String AFFIRMSTATE = "affirmState";

    public static final String BLLTYPE = "bllType";

    public static final String KERSIGN = "kerSign";

    public static final String PERMITTERSIGN = "permitterSign";

    public static final String BEIYON = "beiyon";

    public static final String BEIYONR = "beiyonr";

    public static final String BEIYONS = "beiyons";

    public static final String BEIYONF = "beiyonf";

    public static final String BEIYONW = "beiyonw";

    public static final String BEIYONL = "beiyonl";

    @Override
    protected Serializable pkVal() {
        return this.fundBillNo;
    }

}
