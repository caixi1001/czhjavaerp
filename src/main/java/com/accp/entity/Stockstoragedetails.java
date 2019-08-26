package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@ApiModel(value="Stockstoragedetails对象", description="")
public class Stockstoragedetails extends Model<Stockstoragedetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "引用采购入库单单号")
    private Integer storagedetailno;

    @ApiModelProperty(value = "行号")
    private Integer rowno;

    @ApiModelProperty(value = "引用物料文件ID")
    private String materielid;

    @ApiModelProperty(value = "物料名称")
    private String types;

    @ApiModelProperty(value = "单位")
    private String units;

    @ApiModelProperty(value = "数量")
    private Integer amount;

    @ApiModelProperty(value = "折扣前单价")
    private Double rebateprice;

    @ApiModelProperty(value = "折扣")
    private Double rebate;

    @ApiModelProperty(value = "单价")
    private Double unitprice;

    @ApiModelProperty(value = "金额")
    private Double moneys;

    @ApiModelProperty(value = "税率")
    private Double cess;

    @ApiModelProperty(value = "税额")
    private Double tax;

    @ApiModelProperty(value = "含税金额")
    private Double taxmoneys;

    @ApiModelProperty(value = "来源单别")
    private String origintype;

    @ApiModelProperty(value = "来源单号")
    private String originno;

    @ApiModelProperty(value = "是否赠品")
    private Integer present;

    @ApiModelProperty(value = "分摊费用")
    private Double apportionmoney;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "备用字段")
    private String safetyone;

    @ApiModelProperty(value = "备用字段")
    private String safetytwo;


    public static final String STORAGEDETAILNO = "storagedetailno";

    public static final String ROWNO = "rowno";

    public static final String MATERIELID = "materielid";

    public static final String TYPES = "types";

    public static final String UNITS = "units";

    public static final String AMOUNT = "amount";

    public static final String REBATEPRICE = "rebateprice";

    public static final String REBATE = "rebate";

    public static final String UNITPRICE = "unitprice";

    public static final String MONEYS = "moneys";

    public static final String CESS = "cess";

    public static final String TAX = "tax";

    public static final String TAXMONEYS = "taxmoneys";

    public static final String ORIGINTYPE = "origintype";

    public static final String ORIGINNO = "originno";

    public static final String PRESENT = "present";

    public static final String APPORTIONMONEY = "apportionmoney";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
