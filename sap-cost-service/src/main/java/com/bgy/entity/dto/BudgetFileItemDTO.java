package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yyg
 * @date 2018/4/18 12:00
 * @desc 一般预算调整附件DTO实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetFileItemDTO {
    

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