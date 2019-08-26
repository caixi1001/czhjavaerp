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
@ApiModel(value="Otheroutstock对象", description="")
public class Otheroutstock extends Model<Otheroutstock> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("billNo")
    private String billNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("adjustDate")
    private LocalDate adjustDate;

    @ApiModelProperty(value = "仓库ID")
    @TableField("wareID")
    private Integer wareID;

    @ApiModelProperty(value = "仓库名称")
    @TableField("wareName")
    private String wareName;

    @ApiModelProperty(value = "出库类型ID")
    @TableField("billStyleID")
    private Integer billStyleID;

    @ApiModelProperty(value = "其它出库类型名称")
    @TableField("billStyleName")
    private String billStyleName;

    @ApiModelProperty(value = "出库人员ID")
    @TableField("salesID")
    private Integer salesID;

    @ApiModelProperty(value = "出库人员名称")
    @TableField("salesName")
    private String salesName;

    @ApiModelProperty(value = "所属部门ID")
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


    public static final String BILLNO = "billNo";

    public static final String ADJUSTDATE = "adjustDate";

    public static final String WAREID = "wareID";

    public static final String WARENAME = "wareName";

    public static final String BILLSTYLEID = "billStyleID";

    public static final String BILLSTYLENAME = "billStyleName";

    public static final String SALESID = "salesID";

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
