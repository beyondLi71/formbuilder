package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author yyg
* @date 2018/4/18 18:45
* @desc TR-TR034_2-账户变更 附件VO实体
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccApplyAlterItemVO {

    private String headid;

    private String zfileid;

    private String filetype;

    private String filename;

    private String fileurl;

    private String pictureurl;

}
