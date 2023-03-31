package com.example.client.tool.scm.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GitHubResponseDTO {
  private String name;
  private String status;
}
