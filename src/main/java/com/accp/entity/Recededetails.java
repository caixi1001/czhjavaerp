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
@ApiModel(value="Recededetails对象", description="")
public class Recededetails extends Model<Recededetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "采购退货单号")
    private String recid;

    @ApiModelProperty(value = "序号")
    private Integer detsequ;

    @ApiModelProperty(value = "物料编号")
    private String matid;

    @ApiModelProperty(value = "物料名称")
    private String matname;

    @ApiModelProperty(value = "规格型号")
    private String matspec;

    @ApiModelProperty(value = "数量")
    private Integer detnum;

    @ApiModelProperty(value = "折扣前单价")
    private Double detagioprice;

    @ApiModelProperty(value = "折数")
    private Double detdiscount;

    @ApiModelProperty(value = "单价")
    private Double detprice;

    @ApiModelProperty(value = "金额")
    private Double detamtmoney;

    @ApiModelProperty(value = "税率")
    private Double depcess;

    @ApiModelProperty(value = "税额")
    private Double depcessmoney;

    @ApiModelProperty(value = "是否赠品")
    private Integer deplargess;

    @ApiModelProperty(value = "来源单别")
    private String sodorigintype;

    @ApiModelProperty(value = "来源单号")
    private String sodorigin;

    @ApiModelProperty(value = "标识是否删除")
    private String enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String RECID = "recid";

    public static final String DETSEQU = "detsequ";

    public static final String MATID = "matid";

    public static final String MATNAME = "matname";

    public static final String MATSPEC = "matspec";

    public static final String DETNUM = "detnum";

    public static final String DETAGIOPRICE = "detagioprice";

    public static final String DETDISCOUNT = "detdiscount";

    public static final String DETPRICE = "detprice";

    public static final String DETAMTMONEY = "detamtmoney";

    public static final String DEPCESS = "depcess";

    public static final String DEPCESSMONEY = "depcessmoney";

    public static final String DEPLARGESS = "deplargess";

    public static final String SODORIGINTYPE = "sodorigintype";

    public static final String SODORIGIN = "sodorigin";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
