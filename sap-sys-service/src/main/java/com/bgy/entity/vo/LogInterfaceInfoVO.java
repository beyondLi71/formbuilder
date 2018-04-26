package com.bgy.entity.vo;

import com.bgy.entity.enums.HttpTypeEnums;
import com.bgy.entity.enums.LogInterfaceStatusEnums;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by beyondLi
 * Date 2018/4/11 21:39
 * Desc .新增log接口DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogInterfaceInfoVO {
    //id
    private Integer id;
    //接口名称
    private String interfaceName;
    //url
    private String url;
    //请求方式
    private HttpTypeEnums methodType;
    //方法名称
    private String methodName;
    //每天允许最大请求次数
    private Integer maxLimit;
    //接口状态
    private LogInterfaceStatusEnums useStatus;
    //备注
    private String remark;
    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    //修改时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

}
