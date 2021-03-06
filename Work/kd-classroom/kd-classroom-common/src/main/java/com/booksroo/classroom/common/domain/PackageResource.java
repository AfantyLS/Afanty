package com.booksroo.classroom.common.domain;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class PackageResource extends BaseDomain {

    /**
     * package_class表id -- package_resource.package_class_id
     * 创建时间 : 2018-06-13 10:21:04
     */
    private Long packageClassId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column package_resource.resource_id
     * 创建时间 : 2018-06-13 10:21:04
     */
    private Long resourceId;

    /**
     * 该资源在该班级的状态，0-未开始，1-已结束，2-未结束(进行中) -- package_resource.status
     * 创建时间 : 2018-06-13 10:21:04
     */
    private Byte status;

    /**
     * 该资源在该班级进行到的当前页码 -- package_resource.current_no
     * 创建时间 : 2018-06-13 10:21:04
     */
    private Integer currentNo;

    /**
     * 预留一个备注字段 -- package_resource.remark
     * 创建时间 : 2018-06-13 10:21:04
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column package_resource.del_flag
     * 创建时间 : 2018-06-13 10:21:04
     */
    private Boolean delFlag;

    /**
     * package_resource表的操作属性:serialVersionUID
     * 创建时间 : 2018-06-13 10:21:04
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 package_resource.package_class_id的get方法 
     * 创建时间 : 2018-06-13 10:21:04
     */
    public Long getPackageClassId() {
        return packageClassId;
    }

    /**
     * 数据字段 package_resource.package_class_id的set方法
     * 创建时间 : 2018-06-13 10:21:04
     */
    public void setPackageClassId(Long packageClassId) {
        this.packageClassId = packageClassId;
    }

    /**
     * 数据字段 package_resource.resource_id的get方法 
     * 创建时间 : 2018-06-13 10:21:04
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * 数据字段 package_resource.resource_id的set方法
     * 创建时间 : 2018-06-13 10:21:04
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 数据字段 package_resource.status的get方法 
     * 创建时间 : 2018-06-13 10:21:04
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 数据字段 package_resource.status的set方法
     * 创建时间 : 2018-06-13 10:21:04
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 数据字段 package_resource.current_no的get方法 
     * 创建时间 : 2018-06-13 10:21:04
     */
    public Integer getCurrentNo() {
        return currentNo;
    }

    /**
     * 数据字段 package_resource.current_no的set方法
     * 创建时间 : 2018-06-13 10:21:04
     */
    public void setCurrentNo(Integer currentNo) {
        this.currentNo = currentNo;
    }

    /**
     * 数据字段 package_resource.remark的get方法 
     * 创建时间 : 2018-06-13 10:21:04
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 数据字段 package_resource.remark的set方法
     * 创建时间 : 2018-06-13 10:21:04
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 数据字段 package_resource.del_flag的get方法 
     * 创建时间 : 2018-06-13 10:21:04
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * 数据字段 package_resource.del_flag的set方法
     * 创建时间 : 2018-06-13 10:21:04
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}