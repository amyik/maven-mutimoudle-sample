package com.example.scmtool.service;

import com.example.client.tool.scm.GitHubClient;
import com.example.scmtool.model.ScmToolVo;
import com.example.scmtool.repository.ScmToolDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScmToolService {

  private final ScmToolDao scmToolDao;
  public ScmToolVo getScmInfo() {
    final ScmToolVo scmToolVo = scmToolDao.sampleMethod();
    final GitHubClient githubClient = new GitHubClient();
    final String status = githubClient.getStatus();

    return scmToolVo.toBuilder().status(status).build();
  }
}
