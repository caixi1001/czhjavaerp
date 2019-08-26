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
@ApiModel(value="Movesub对象", description="")
public class Movesub extends Model<Movesub> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据编号")
    @TableId("moveNO")
    private String moveNO;

    @ApiModelProperty(value = "栏号")
    @TableField("serNO")
    private Integer serNO;

    @ApiModelProperty(value = "单据日期")
    @TableField("moveDate")
    private LocalDate moveDate;

    @ApiModelProperty(value = "物料编号")
    @TableField("prodID")
    private String prodID;

    @ApiModelProperty(value = "数量")
    private Integer quantity;

    @ApiModelProperty(value = "分录备注")
    @TableField("itemRemark")
    private String itemRemark;

    @ApiModelProperty(value = "使用有效日期")
    @TableField("validDateUsed")
    private Boolean validDateUsed;

    @TableField("columOne")
    private String columOne;

    @TableField("columTow")
    private String columTow;

    @TableField("columThree")
    private String columThree;


    public static final String MOVENO = "moveNO";

    public static final String SERNO = "serNO";

    public static final String MOVEDATE = "moveDate";

    public static final String PRODID = "prodID";

    public static final String QUANTITY = "quantity";

    public static final String ITEMREMARK = "itemRemark";

    public static final String VALIDDATEUSED = "validDateUsed";

    public static final String COLUMONE = "columOne";

    public static final String COLUMTOW = "columTow";

    public static final String COLUMTHREE = "columThree";

    @Override
    protected Serializable pkVal() {
        return this.moveNO;
    }

}
