package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yyg
 * @date 2018/4/18 12:00
 * @desc 一般预算调整附件实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetFileItemVO {


    private Long id;

    private String headid;

    private String zfileid;

    private String filetype;

    private String filename;

    private String fileurl;

    private String pictureurl;

}