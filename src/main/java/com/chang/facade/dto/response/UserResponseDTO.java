package com.chang.facade.dto.response;

/**
 * @author 常培兵
 * @Description: 描述
 * @date 2018/3/22 11:12
 */
public class UserResponseDTO {
    private Integer id;
    private String name;
    private String password;
    private String email;
    private Integer phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public UserResponseDTO(Integer id, String name, String password, String email, Integer phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public UserResponseDTO() {
    }
}

