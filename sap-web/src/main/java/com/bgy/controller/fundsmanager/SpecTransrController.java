package com.bgy.controller.fundsmanager;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.entity.dto.SpecTransrDTO;
import com.bgy.service.SpecTransrService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Ren ZhiQiang
 * @date 2018/4/23 23:47
 * @desc
 */
@RestController
@Api(value = "sap", tags = {"fundsmanager"})
@RequestMapping("/fundsmanager/spectransr")
public class SpecTransrController {

    @Resource
    SpecTransrService specTransrService;

     /**
      * @author Ren ZhiQiang
      * @date 2018/4/24 0:01
      * @desc 存储表单
      */
     @ApiOperation(value = "保存TR096 (特转审批)", produces = "application/json")
     @PostMapping(value = "/savespectransr")
     public AbstractApiResult saveSpecTransr(@RequestBody SpecTransrDTO specTransrDTO){
         return AbstractApiResult.success(specTransrService.saveSpecTransr(specTransrDTO.getBusinessData(), specTransrDTO.getFormInfo()));
     }
      /**
       * @author Ren ZhiQiang
       * @date 2018/4/24 0:08
       * @desc 展示表单
       */
      @ApiOperation(value = "获取TR-096(特转审批)",produces = "application/json")
      @GetMapping(value = "/getspectransr/{id}")
      public AbstractApiResult getspectransr(@PathVariable("id") String docId) {
          return AbstractApiResult.success(specTransrService.getSpecTransr(docId));
      }
}
