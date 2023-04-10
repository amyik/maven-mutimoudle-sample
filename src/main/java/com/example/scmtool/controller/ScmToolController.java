package com.example.scmtool.controller;

import com.example.common.utils.CommonUtil;
import com.example.scmtool.model.SampleResponseDTO;
import com.example.scmtool.model.ScmToolVo;
import com.example.scmtool.service.ScmToolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ScmToolController {

  private final ScmToolService scmToolService;

  @GetMapping("/sample")
  public SampleResponseDTO sampleController() {
    final String utilString = CommonUtil.sampleMethod();
    final ScmToolVo scmToolVo = scmToolService.getScmInfo();
    return SampleResponseDTO.builder().message(utilString + "sampleController" + ", " + scmToolVo.toString()).build();
  }

}
