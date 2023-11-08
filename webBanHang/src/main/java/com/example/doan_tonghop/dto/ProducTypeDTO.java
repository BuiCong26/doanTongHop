package com.example.doan_tonghop.dto;

public class ProducTypeDTO extends BaseDTO<ProducTypeDTO> {
    private String nameOfType;
    private Long createBy;

    public ProducTypeDTO(String nameOfType, Long createBy) {
        this.nameOfType = nameOfType;
        this.createBy = createBy;
    }
    public ProducTypeDTO() {}

    public String getNameOfType() {
        return nameOfType;
    }

    public void setNameOfType(String nameOfType) {
        this.nameOfType = nameOfType;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }
}
