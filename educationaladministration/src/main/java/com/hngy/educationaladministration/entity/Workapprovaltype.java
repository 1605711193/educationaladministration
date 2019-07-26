package com.hngy.educationaladministration.entity;

public class Workapprovaltype {
    private Long id;

    private String typename;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "Workapprovaltype{" +
                "id=" + id +
                ", typename='" + typename + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}