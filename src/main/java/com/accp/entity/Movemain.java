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
@ApiModel(value="Movemain对象", description="")
public class Movemain extends Model<Movemain> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据编号")
    @TableId("moveNO")
    private String moveNO;

    @ApiModelProperty(value = "单据日期")
    @TableField("moveDate")
    private LocalDate moveDate;

    @ApiModelProperty(value = "制单人员编号")
    @TableField("makerID")
    private String makerID;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员编号")
    @TableField("permitterID")
    private String permitterID;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "调入仓库编号")
    @TableField("wareID")
    private String wareID;

    @ApiModelProperty(value = "调出仓库编号")
    @TableField("wareOutID")
    private String wareOutID;

    @ApiModelProperty(value = "数量合计")
    @TableField("sumQty")
    private Integer sumQty;

    @ApiModelProperty(value = "是否过账")
    @TableField("hasCheck")
    private Boolean hasCheck;

    @ApiModelProperty(value = "自定义一")
    private String udef1;

    @ApiModelProperty(value = "自定义二")
    private String udef2;

    @ApiModelProperty(value = "备注")
    private String remark;

    @TableField("columOne")
    private String columOne;

    @TableField("columTow")
    private String columTow;

    @TableField("columThree")
    private String columThree;


    public static final String MOVENO = "moveNO";

    public static final String MOVEDATE = "moveDate";

    public static final String MAKERID = "makerID";

    public static final String MAKER = "maker";

    public static final String PERMITTERID = "permitterID";

    public static final String PERMITTER = "permitter";

    public static final String WAREID = "wareID";

    public static final String WAREOUTID = "wareOutID";

    public static final String SUMQTY = "sumQty";

    public static final String HASCHECK = "hasCheck";

    public static final String UDEF1 = "udef1";

    public static final String UDEF2 = "udef2";

    public static final String REMARK = "remark";

    public static final String COLUMONE = "columOne";

    public static final String COLUMTOW = "columTow";

    public static final String COLUMTHREE = "columThree";

    @Override
    protected Serializable pkVal() {
        return this.moveNO;
    }

}
