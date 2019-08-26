package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@ApiModel(value="Prepaidandbz对象", description="")
public class Prepaidandbz extends Model<Prepaidandbz> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "预付金额")
    private Double amountadvanced;

    @ApiModelProperty(value = "来源别")
    private String classified;

    @ApiModelProperty(value = "来源单号")
    private String sourcenumber;

    @ApiModelProperty(value = "摘要")
    private String bstract;

    @ApiModelProperty(value = "自定义栏一")
    @TableField("uDefone")
    private String uDefone;

    @ApiModelProperty(value = "自定义栏二")
    @TableField("uDeftow")
    private String uDeftow;

    @ApiModelProperty(value = "备注")
    @TableField("Remark")
    private String Remark;

    private String beiyon;

    private String beiyone;

    private String beiyons;


    public static final String AMOUNTADVANCED = "amountadvanced";

    public static final String CLASSIFIED = "classified";

    public static final String SOURCENUMBER = "sourcenumber";

    public static final String BSTRACT = "bstract";

    public static final String UDEFONE = "uDefone";

    public static final String UDEFTOW = "uDeftow";

    public static final String REMARK = "Remark";

    public static final String BEIYON = "beiyon";

    public static final String BEIYONE = "beiyone";

    public static final String BEIYONS = "beiyons";

    @Override
    protected Serializable pkVal() {
        return this.amountadvanced;
    }

}
