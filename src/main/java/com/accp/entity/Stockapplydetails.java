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
 * 采购请购明细表
 * </p>
 *
 * @author ChenZhihao
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Stockapplydetails对象", description="采购请购明细表")
public class Stockapplydetails extends Model<Stockapplydetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标识列")
    private Integer flag;

    @ApiModelProperty(value = "行号")
    @TableField("serNO")
    private Integer serNO;

    @ApiModelProperty(value = "请购单单据号码")
    @TableField("billNo")
    private String billNo;

    @ApiModelProperty(value = "物料编号(伪外：物料主文件)")
    @TableField("prodID")
    private String prodID;

    @ApiModelProperty(value = "物料名称")
    @TableField("prodName")
    private String prodName;

    @ApiModelProperty(value = "规格型号")
    @TableField("prodSize")
    private String prodSize;

    @ApiModelProperty(value = "单位名称")
    @TableField("sUnit")
    private String sUnit;

    @ApiModelProperty(value = "数量")
    @TableField("sQuantity")
    private Integer sQuantity;

    @ApiModelProperty(value = "标准进价")
    @TableField("sPrice")
    private Double sPrice;

    @ApiModelProperty(value = "标准进价金额")
    private Double amount;

    @ApiModelProperty(value = "单价")
    @TableField("lastestsPrice")
    private Double lastestsPrice;

    @ApiModelProperty(value = "进价金额")
    @TableField("lastestsAmount")
    private Double lastestsAmount;

    @ApiModelProperty(value = "需求日期")
    @TableField("preInDate")
    private LocalDate preInDate;

    @ApiModelProperty(value = "建议采购日期")
    @TableField("suggestPurDate")
    private LocalDate suggestPurDate;

    @ApiModelProperty(value = "未采购数量")
    @TableField("qtyRemain")
    private Double qtyRemain;

    @ApiModelProperty(value = "来源单别")
    @TableField("tranType")
    private String tranType;

    @ApiModelProperty(value = "来源单号")
    @TableField("fromNO")
    private String fromNO;

    @ApiModelProperty(value = "备注")
    private String apdremark;

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

    public static final String SUNIT = "sUnit";

    public static final String SQUANTITY = "sQuantity";

    public static final String SPRICE = "sPrice";

    public static final String AMOUNT = "amount";

    public static final String LASTESTSPRICE = "lastestsPrice";

    public static final String LASTESTSAMOUNT = "lastestsAmount";

    public static final String PREINDATE = "preInDate";

    public static final String SUGGESTPURDATE = "suggestPurDate";

    public static final String QTYREMAIN = "qtyRemain";

    public static final String TRANTYPE = "tranType";

    public static final String FROMNO = "fromNO";

    public static final String APDREMARK = "apdremark";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.flag;
    }

}
