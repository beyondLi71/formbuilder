package com.bgy.entity.po;

import com.bgy.entity.dto.FormInfoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by beyondLi
 * Date 2018/4/12 10:52
 * Desc .
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetSapInfoPO {
    public FormInfoDTO formInfo;
    public BusinessDataPO businessData;
}
