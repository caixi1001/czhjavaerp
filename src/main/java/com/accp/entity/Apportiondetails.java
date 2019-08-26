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
@ApiModel(value="Apportiondetails对象", description="")
public class Apportiondetails extends Model<Apportiondetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "采购分摊单号(采购分摊外键)")
    private String adeid;

    @ApiModelProperty(value = "序号")
    private Integer adesequ;

    @ApiModelProperty(value = "费用编号")
    private String adeexesid;

    @ApiModelProperty(value = "费用名称")
    private String adeexesname;

    @ApiModelProperty(value = "金额")
    private Double adeamtmoney;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String ADEID = "adeid";

    public static final String ADESEQU = "adesequ";

    public static final String ADEEXESID = "adeexesid";

    public static final String ADEEXESNAME = "adeexesname";

    public static final String ADEAMTMONEY = "adeamtmoney";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
