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
@ApiModel(value="Otheroutstocklist对象", description="")
public class Otheroutstocklist extends Model<Otheroutstocklist> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主表的单据号码")
    @TableField("billNo")
    private String billNo;

    @ApiModelProperty(value = "物料编号")
    @TableField("prodID")
    private Integer prodID;

    @ApiModelProperty(value = "物料名称")
    @TableField("prodName")
    private String prodName;

    @ApiModelProperty(value = "物料类别ID")
    @TableField("prdClassID")
    private Integer prdClassID;

    @ApiModelProperty(value = "类别名称")
    @TableField("prdClassName")
    private String prdClassName;

    @ApiModelProperty(value = "规格型号")
    @TableField("prodSize")
    private String prodSize;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "数量")
    private Integer quantity;

    @ApiModelProperty(value = "金额")
    private Double amount;

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

    public static final String UNIT = "unit";

    public static final String QUANTITY = "quantity";

    public static final String AMOUNT = "amount";

    public static final String ITEMREMARK = "itemRemark";

    public static final String COLUMONE = "columone";

    public static final String COLUMTOW = "columtow";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
