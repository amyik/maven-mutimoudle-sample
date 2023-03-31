package com.example.scmtool.controller;

import com.example.common.utils.CommonUtil;
import com.example.scmtool.model.SampleResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScmToolController {

  @GetMapping("/sample")
  public SampleResponseDTO sampleController() {
    final String utilString = CommonUtil.sampleMethod();
    return SampleResponseDTO.builder().message(utilString + "sampleController").build();
  }

}
