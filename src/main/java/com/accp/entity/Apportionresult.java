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
@ApiModel(value="Apportionresult对象", description="")
public class Apportionresult extends Model<Apportionresult> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "采购分摊单号(采购分摊外键)")
    private String atiid;

    @ApiModelProperty(value = "序号")
    private Integer atisequ;

    @ApiModelProperty(value = "采购入库单")
    private String storageid;

    @ApiModelProperty(value = "物料编号")
    private String matid;

    @ApiModelProperty(value = "物料名称")
    private String matname;

    @ApiModelProperty(value = "采购金额")
    private Double stockprice;

    @ApiModelProperty(value = "规格型号")
    private String matspec;

    @ApiModelProperty(value = "数量")
    private Integer atinum;

    @ApiModelProperty(value = "分摊金额")
    private Double ademoney;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String ATIID = "atiid";

    public static final String ATISEQU = "atisequ";

    public static final String STORAGEID = "storageid";

    public static final String MATID = "matid";

    public static final String MATNAME = "matname";

    public static final String STOCKPRICE = "stockprice";

    public static final String MATSPEC = "matspec";

    public static final String ATINUM = "atinum";

    public static final String ADEMONEY = "ademoney";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
