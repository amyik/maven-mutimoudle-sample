package com.example.scmtool.repository;

import com.example.scmtool.model.ScmToolEntity;
import com.example.scmtool.model.ScmToolVo;
import org.springframework.stereotype.Repository;

@Repository
public class ScmToolDao {

  public ScmToolVo sampleMethod() {
    final ScmToolEntity scmToolName = ScmToolEntity.builder().id(10L).name("scmToolName").build();
    return scmToolName.toVo();
  }
}
