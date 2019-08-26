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
@ApiModel(value="Adjustsub对象", description="")
public class Adjustsub extends Model<Adjustsub> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据编号")
    @TableId("adjustNO")
    private String adjustNO;

    @ApiModelProperty(value = "单据类型")
    @TableField("adjustStyle")
    private String adjustStyle;

    @ApiModelProperty(value = "栏号")
    @TableField("serNO")
    private Integer serNO;

    @ApiModelProperty(value = "单据日期")
    @TableField("adjustDate")
    private LocalDate adjustDate;

    @ApiModelProperty(value = "账面数量/库存量")
    @TableField("curQty")
    private Integer curQty;

    @ApiModelProperty(value = "盘点数量")
    @TableField("checkQty")
    private Integer checkQty;

    @ApiModelProperty(value = "亏盈数量")
    private Integer quantity;

    @ApiModelProperty(value = "单价")
    private Float price;

    @ApiModelProperty(value = "亏盈金额/调价金额")
    private Float amount;

    @ApiModelProperty(value = "原因/分录备注")
    @TableField("itemRemark")
    private String itemRemark;

    @ApiModelProperty(value = "物料编号")
    @TableField("prodID")
    private String prodID;

    @TableField("columOne")
    private String columOne;

    @TableField("columTow")
    private String columTow;

    @TableField("columThree")
    private String columThree;


    public static final String ADJUSTNO = "adjustNO";

    public static final String ADJUSTSTYLE = "adjustStyle";

    public static final String SERNO = "serNO";

    public static final String ADJUSTDATE = "adjustDate";

    public static final String CURQTY = "curQty";

    public static final String CHECKQTY = "checkQty";

    public static final String QUANTITY = "quantity";

    public static final String PRICE = "price";

    public static final String AMOUNT = "amount";

    public static final String ITEMREMARK = "itemRemark";

    public static final String PRODID = "prodID";

    public static final String COLUMONE = "columOne";

    public static final String COLUMTOW = "columTow";

    public static final String COLUMTHREE = "columThree";

    @Override
    protected Serializable pkVal() {
        return this.adjustNO;
    }

}
