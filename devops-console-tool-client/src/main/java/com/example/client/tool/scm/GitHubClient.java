package com.example.client.tool.scm;

import com.example.client.tool.scm.model.GitHubResponseDTO;
import com.example.common.utils.CommonUtil;

public class GitHubClient {

  public String getStatus() {
    final String s = CommonUtil.sampleMethod();
    final GitHubResponseDTO gitHubResponseDTO = GitHubResponseDTO.builder().status("OK").build();
    return gitHubResponseDTO.getStatus();
  }

}
