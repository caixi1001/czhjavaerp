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
 * 采购订单明细表
 * </p>
 *
 * @author ChenZhihao
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Stockorderdetails对象", description="采购订单明细表")
public class Stockorderdetails extends Model<Stockorderdetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标识列")
    private Integer flag;

    @ApiModelProperty(value = "行号")
    @TableField("serNO")
    private Integer serNO;

    @ApiModelProperty(value = "单据号码")
    @TableField("billNo")
    private String billNo;

    @ApiModelProperty(value = "物料编号")
    @TableField("prodID")
    private String prodID;

    @ApiModelProperty(value = "物料名称")
    @TableField("prodName")
    private String prodName;

    @ApiModelProperty(value = "规格型号")
    @TableField("prodSize")
    private String prodSize;

    @ApiModelProperty(value = "数量")
    @TableField("sQuantity")
    private Integer sQuantity;

    @ApiModelProperty(value = "折前单价")
    @TableField("oldPrice")
    private Double oldPrice;

    @ApiModelProperty(value = "折数(%)")
    private Double discount;

    @ApiModelProperty(value = "单价")
    @TableField("sPrice")
    private Double sPrice;

    @ApiModelProperty(value = "金额")
    private Double amount;

    @ApiModelProperty(value = "税率(%)")
    @TableField("taxRate")
    private Double taxRate;

    @ApiModelProperty(value = "税额")
    @TableField("taxAmt")
    private Double taxAmt;

    @ApiModelProperty(value = "含税金额")
    @TableField("vfTotal")
    private Double vfTotal;

    @ApiModelProperty(value = "预入库日")
    @TableField("preInDate")
    private LocalDate preInDate;

    @ApiModelProperty(value = "未入库量")
    @TableField("qtyRemain")
    private Integer qtyRemain;

    @ApiModelProperty(value = "赠品:是/否")
    @TableField("isGift")
    private Double isGift;

    @ApiModelProperty(value = "来源单号")
    @TableField("fromNo")
    private String fromNo;

    @ApiModelProperty(value = "来源单别")
    @TableField("tranType")
    private String tranType;

    @ApiModelProperty(value = "备注")
    @TableField("itemRemark")
    private String itemRemark;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段1")
    private String safetyone;

    @ApiModelProperty(value = "保留字段2")
    private String safetytwo;


    public static final String FLAG = "flag";

    public static final String SERNO = "serNO";

    public static final String BILLNO = "billNo";

    public static final String PRODID = "prodID";

    public static final String PRODNAME = "prodName";

    public static final String PRODSIZE = "prodSize";

    public static final String SQUANTITY = "sQuantity";

    public static final String OLDPRICE = "oldPrice";

    public static final String DISCOUNT = "discount";

    public static final String SPRICE = "sPrice";

    public static final String AMOUNT = "amount";

    public static final String TAXRATE = "taxRate";

    public static final String TAXAMT = "taxAmt";

    public static final String VFTOTAL = "vfTotal";

    public static final String PREINDATE = "preInDate";

    public static final String QTYREMAIN = "qtyRemain";

    public static final String ISGIFT = "isGift";

    public static final String FROMNO = "fromNo";

    public static final String TRANTYPE = "tranType";

    public static final String ITEMREMARK = "itemRemark";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.flag;
    }

}
