package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yyg
 * @date 2018/4/19 13:20
 * @desc TR-TR034_3-账户变更 附件DTO实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccApplyCloseAccItemDTO {

    @JsonProperty("HEADID")
    private String headid;

    @JsonProperty("ZFILEID")
    private String zfileid;

    @JsonProperty("FILETYPE")
    private String filetype;

    @JsonProperty("FILENAME")
    private String filename;

    @JsonProperty("FILEURL")
    private String fileurl;

    @JsonProperty("PICTUREURL")
    private String pictureurl;


}
