package desafioIBM.dto;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import desafioIBM.model.Role;

public class UserResponseDTO {

  @ApiModelProperty(position = 0)
  private Integer id;
  @ApiModelProperty(position = 1)
  private String username;
  @ApiModelProperty(position = 2)
  List<Role> roles;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() { return username; }

  public void setUsername(String username) { this.username = username; }

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

}
