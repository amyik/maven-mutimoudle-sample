package com.example.scmtool.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class ScmToolEntity {
  private Long id;
  private String name;

  public ScmToolVo toVo() {
    return ScmToolVo.builder().id(this.id).name(this.name).build();
  }
}
