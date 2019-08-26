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
@ApiModel(value="Apportionwise对象", description="")
public class Apportionwise extends Model<Apportionwise> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分摊方式编号")
    private String wisid;

    @ApiModelProperty(value = "分摊方式名称")
    private String wisname;

    @ApiModelProperty(value = "英文名称")
    private String wisename;

    @ApiModelProperty(value = "备注")
    private String wisremark;

    @ApiModelProperty(value = "标识是否删除")
    private String enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String WISID = "wisid";

    public static final String WISNAME = "wisname";

    public static final String WISENAME = "wisename";

    public static final String WISREMARK = "wisremark";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
