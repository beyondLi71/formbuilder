package com.bgy.entity.vo;

import com.bgy.entity.dto.FundTransHeadDTO;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 资金划转业务的数据实体
 * @by linlangleo
 * @date 2018/4/18 10:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundTransBusinessDataVO {
    //主表
    private FundTransHeadVO fundTransRecord;
}
