package com.hngy.educationaladministration.entity;

public class Workapprovaldata {
    private Long id;

    private Long idWorkapproval;

    private String news;

    private String datarar;

    private Integer flag;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdWorkapproval() {
        return idWorkapproval;
    }

    public void setIdWorkapproval(Long idWorkapproval) {
        this.idWorkapproval = idWorkapproval;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news == null ? null : news.trim();
    }

    public String getDatarar() {
        return datarar;
    }

    public void setDatarar(String datarar) {
        this.datarar = datarar == null ? null : datarar.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}