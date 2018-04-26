package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yyg
 * @date 2018/4/19 13:45
 * @desc TR-TR034_3-账户注销 附件VO实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccApplyCloseAccountItemVO {

    private String headid;

    private String zfileid;

    private String filetype;

    private String filename;

    private String fileurl;

    private String pictureurl;

}
