package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@ApiModel(value="Saleofferlist对象", description="")
public class Saleofferlist extends Model<Saleofferlist> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主表的单据号码")
    @TableField("billNo")
    private String billNo;

    @ApiModelProperty(value = "物料编号")
    @TableField("prodID")
    private String prodID;

    @ApiModelProperty(value = "物料名称")
    @TableField("prodName")
    private String prodName;

    @ApiModelProperty(value = "物料类别")
    @TableField("prdClassID")
    private Integer prdClassID;

    @ApiModelProperty(value = "类别名称")
    @TableField("prdClassName")
    private String prdClassName;

    @ApiModelProperty(value = "规格型号")
    @TableField("prodSize")
    private String prodSize;

    @ApiModelProperty(value = "单位名称")
    @TableField("sUnit")
    private String sUnit;

    @ApiModelProperty(value = "数量")
    @TableField("sQuantity")
    private Integer sQuantity;

    @ApiModelProperty(value = "折扣前单价")
    @TableField("oldPrice")
    private Double oldPrice;

    @ApiModelProperty(value = "折数")
    private Double discount;

    @ApiModelProperty(value = "单价")
    @TableField("sPrice")
    private Double sPrice;

    @ApiModelProperty(value = "金额")
    private Double amount;

    @ApiModelProperty(value = "税率")
    @TableField("taxRate")
    private Double taxRate;

    @ApiModelProperty(value = "税额")
    @TableField("taxAmt")
    private Integer taxAmt;

    @ApiModelProperty(value = "含税金额")
    @TableField("vFTotal")
    private Integer vFTotal;

    @ApiModelProperty(value = "赠送1为赠送2则为不增送")
    @TableField("isGift")
    private Integer isGift;

    @ApiModelProperty(value = "分录备注")
    @TableField("itemRemark")
    private String itemRemark;

    @ApiModelProperty(value = "备用字段1")
    private String columone;

    @ApiModelProperty(value = "备用字段2")
    private String columtow;


    public static final String BILLNO = "billNo";

    public static final String PRODID = "prodID";

    public static final String PRODNAME = "prodName";

    public static final String PRDCLASSID = "prdClassID";

    public static final String PRDCLASSNAME = "prdClassName";

    public static final String PRODSIZE = "prodSize";

    public static final String SUNIT = "sUnit";

    public static final String SQUANTITY = "sQuantity";

    public static final String OLDPRICE = "oldPrice";

    public static final String DISCOUNT = "discount";

    public static final String SPRICE = "sPrice";

    public static final String AMOUNT = "amount";

    public static final String TAXRATE = "taxRate";

    public static final String TAXAMT = "taxAmt";

    public static final String VFTOTAL = "vFTotal";

    public static final String ISGIFT = "isGift";

    public static final String ITEMREMARK = "itemRemark";

    public static final String COLUMONE = "columone";

    public static final String COLUMTOW = "columtow";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
