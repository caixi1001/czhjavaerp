package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@ApiModel(value="Credit对象", description="")
public class Credit extends Model<Credit> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "帐款归属id")
    @TableId("dueToId")
    private String dueToId;

    @ApiModelProperty(value = "付款条件")
    @TableField("payTerm")
    private String payTerm;

    @ApiModelProperty(value = "付款日期")
    @TableField("prepayDay")
    private LocalDateTime prepayDay;

    @ApiModelProperty(value = "结算方式一")
    @TableField("cashPayStyle")
    private Double cashPayStyle;

    @ApiModelProperty(value = "结算方式二")
    @TableField("visaPayStyle")
    private Double visaPayStyle;

    @ApiModelProperty(value = "结算方式三")
    @TableField("otherPayStyle")
    private Double otherPayStyle;

    @ApiModelProperty(value = "结算方式一名称")
    @TableField("cashPayStyleName")
    private String cashPayStyleName;

    @ApiModelProperty(value = "结算方式二名称")
    @TableField("visaPayStyleName")
    private String visaPayStyleName;

    @ApiModelProperty(value = "结算方式三名称")
    @TableField("otherPayStyleName")
    private String otherPayStyleName;

    @ApiModelProperty(value = "自定义栏一")
    @TableField("uDefone")
    private String uDefone;

    @ApiModelProperty(value = "自定义栏二")
    @TableField("uDeftow")
    private String uDeftow;

    @ApiModelProperty(value = "备注")
    private String remark;

    private String beiyon;

    private String beiyonr;

    private String beiyons;

    private String beiyonf;

    private String beiyonw;


    public static final String DUETOID = "dueToId";

    public static final String PAYTERM = "payTerm";

    public static final String PREPAYDAY = "prepayDay";

    public static final String CASHPAYSTYLE = "cashPayStyle";

    public static final String VISAPAYSTYLE = "visaPayStyle";

    public static final String OTHERPAYSTYLE = "otherPayStyle";

    public static final String CASHPAYSTYLENAME = "cashPayStyleName";

    public static final String VISAPAYSTYLENAME = "visaPayStyleName";

    public static final String OTHERPAYSTYLENAME = "otherPayStyleName";

    public static final String UDEFONE = "uDefone";

    public static final String UDEFTOW = "uDeftow";

    public static final String REMARK = "remark";

    public static final String BEIYON = "beiyon";

    public static final String BEIYONR = "beiyonr";

    public static final String BEIYONS = "beiyons";

    public static final String BEIYONF = "beiyonf";

    public static final String BEIYONW = "beiyonw";

    @Override
    protected Serializable pkVal() {
        return this.dueToId;
    }

}
