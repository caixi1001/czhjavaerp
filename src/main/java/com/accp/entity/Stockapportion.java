package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
@ApiModel(value="Stockapportion对象", description="")
public class Stockapportion extends Model<Stockapportion> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "采购分摊单号")
    private String appid;

    @ApiModelProperty(value = "分摊日期")
    private LocalDate appdate;

    @ApiModelProperty(value = "分摊类型")
    private String wisname;

    @ApiModelProperty(value = "待摊金额")
    private Double appamtmoney;

    @ApiModelProperty(value = "制单人员")
    private String makeperson;

    @ApiModelProperty(value = "复核人员")
    private String auditingperson;

    @ApiModelProperty(value = "是否已审核")
    private String estate;

    @ApiModelProperty(value = "标识是否删除")
    private String enables;

    @ApiModelProperty(value = "保留字段1")
    private String safetyone;

    @ApiModelProperty(value = "保留字段2")
    private String safetytwo;


    public static final String APPID = "appid";

    public static final String APPDATE = "appdate";

    public static final String WISNAME = "wisname";

    public static final String APPAMTMONEY = "appamtmoney";

    public static final String MAKEPERSON = "makeperson";

    public static final String AUDITINGPERSON = "auditingperson";

    public static final String ESTATE = "estate";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
