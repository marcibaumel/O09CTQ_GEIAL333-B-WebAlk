package com.licit.licitApp.services.DTO;

public class LicitDTO {

    private Integer UserId;
    private Integer Licit;

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public Integer getLicit() {
        return Licit;
    }

    public void setLicit(Integer licit) {
        Licit = licit;
    }

    public LicitDTO(Integer userId, Integer licit) {
        UserId = userId;
        Licit = licit;
    }
}
