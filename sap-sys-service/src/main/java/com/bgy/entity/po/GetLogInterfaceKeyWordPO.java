package com.bgy.entity.po;

import com.bgy.entity.enums.HttpTypeEnums;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by beyondLi
 * Date 2018/4/11 21:39
 * Desc .新增log接口DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetLogInterfaceKeyWordPO {
    //接口名
    private String interfaceName;
    //url
    private String url;
    //请求方式
    private HttpTypeEnums methodType;
}
