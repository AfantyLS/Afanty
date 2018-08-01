package com.booksroo.classroom.common.domain;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class CatalogResources extends BaseDomain {

    /**
     * 分类id -- catalog_resources.catalog_id
     * 创建时间 : 2018-06-02 22:58:40
     */
    private Long catalogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column catalog_resources.resource_id
     * 创建时间 : 2018-06-02 22:58:40
     */
    private Long resourceId;

    /**
     * 类目跟资源之间的关系，1-该资源是在该类目下被创建，2-该资源从别的类目分享来的 -- catalog_resources.relation
     * 创建时间 : 2018-06-02 22:58:40
     */
    private Byte relation;

    /**
     * catalog_resources表的操作属性:serialVersionUID
     * 创建时间 : 2018-06-02 22:58:40
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 catalog_resources.catalog_id的get方法 
     * 创建时间 : 2018-06-02 22:58:40
     */
    public Long getCatalogId() {
        return catalogId;
    }

    /**
     * 数据字段 catalog_resources.catalog_id的set方法
     * 创建时间 : 2018-06-02 22:58:40
     */
    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * 数据字段 catalog_resources.resource_id的get方法 
     * 创建时间 : 2018-06-02 22:58:40
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * 数据字段 catalog_resources.resource_id的set方法
     * 创建时间 : 2018-06-02 22:58:40
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 数据字段 catalog_resources.relation的get方法 
     * 创建时间 : 2018-06-02 22:58:40
     */
    public Byte getRelation() {
        return relation;
    }

    /**
     * 数据字段 catalog_resources.relation的set方法
     * 创建时间 : 2018-06-02 22:58:40
     */
    public void setRelation(Byte relation) {
        this.relation = relation;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}