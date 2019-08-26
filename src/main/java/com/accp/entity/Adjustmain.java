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
@ApiModel(value="Adjustmain对象", description="")
public class Adjustmain extends Model<Adjustmain> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据编号")
    @TableId("adjustNO")
    private String adjustNO;

    @ApiModelProperty(value = "单据类型（0为盘点单，1为调价单）")
    @TableField("adjustStyle")
    private String adjustStyle;

    @ApiModelProperty(value = "单据日期")
    @TableField("adjustDate")
    private LocalDate adjustDate;

    @ApiModelProperty(value = "制单人员名称")
    private String maker;

    @ApiModelProperty(value = "制单人员编号")
    @TableField("makerID")
    private String makerID;

    @ApiModelProperty(value = "复核人员名称")
    private String permitter;

    @ApiModelProperty(value = "复核人员编号")
    @TableField("permitterID")
    private String permitterID;

    @ApiModelProperty(value = "数量合计")
    @TableField("sumQty")
    private Integer sumQty;

    @ApiModelProperty(value = "金额合计")
    @TableField("sumCost")
    private Float sumCost;

    @ApiModelProperty(value = "自定义一")
    private String udef1;

    @ApiModelProperty(value = "自定义二")
    private String udef2;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "所属部门编号")
    @TableField("departID")
    private String departID;

    @ApiModelProperty(value = "是否过审")
    @TableField("hasCheck")
    private Boolean hasCheck;

    @ApiModelProperty(value = "仓库编号")
    @TableField("wareID")
    private String wareID;

    @ApiModelProperty(value = "盘点人员编号")
    @TableField("salesID")
    private String salesID;

    @ApiModelProperty(value = "账面数量为零载入")
    @TableField("zeroFilter")
    private Boolean zeroFilter;

    @ApiModelProperty(value = "账面数量合计")
    @TableField("sumCurQty")
    private Integer sumCurQty;

    @ApiModelProperty(value = "盘点数量合计")
    @TableField("sumCheckQty")
    private Integer sumCheckQty;

    @ApiModelProperty(value = "增值科目编号")
    @TableField("incSubjectID")
    private String incSubjectID;

    @ApiModelProperty(value = "减值科目编号")
    @TableField("decSujectID")
    private String decSujectID;

    @TableField("columOne")
    private String columOne;

    @TableField("columTow")
    private String columTow;

    @TableField("columThree")
    private String columThree;


    public static final String ADJUSTNO = "adjustNO";

    public static final String ADJUSTSTYLE = "adjustStyle";

    public static final String ADJUSTDATE = "adjustDate";

    public static final String MAKER = "maker";

    public static final String MAKERID = "makerID";

    public static final String PERMITTER = "permitter";

    public static final String PERMITTERID = "permitterID";

    public static final String SUMQTY = "sumQty";

    public static final String SUMCOST = "sumCost";

    public static final String UDEF1 = "udef1";

    public static final String UDEF2 = "udef2";

    public static final String REMARK = "remark";

    public static final String DEPARTID = "departID";

    public static final String HASCHECK = "hasCheck";

    public static final String WAREID = "wareID";

    public static final String SALESID = "salesID";

    public static final String ZEROFILTER = "zeroFilter";

    public static final String SUMCURQTY = "sumCurQty";

    public static final String SUMCHECKQTY = "sumCheckQty";

    public static final String INCSUBJECTID = "incSubjectID";

    public static final String DECSUJECTID = "decSujectID";

    public static final String COLUMONE = "columOne";

    public static final String COLUMTOW = "columTow";

    public static final String COLUMTHREE = "columThree";

    @Override
    protected Serializable pkVal() {
        return this.adjustNO;
    }

}
