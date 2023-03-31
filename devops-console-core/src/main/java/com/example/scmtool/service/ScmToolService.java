package com.example.scmtool.service;

import com.example.scmtool.model.ScmToolVo;
import com.example.scmtool.repository.ScmToolDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScmToolService {

  private final ScmToolDao scmToolDao;
  public ScmToolVo sampleMethod() {
    final ScmToolVo scmToolVo = scmToolDao.sampleMethod();
    return scmToolVo;
  }
}
