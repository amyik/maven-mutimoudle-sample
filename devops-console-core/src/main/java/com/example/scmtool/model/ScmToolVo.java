package com.example.scmtool.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class ScmToolVo {
  private Long id;
  private String name;
  private String status;
}
