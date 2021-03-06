package com.booksroo.classroom.common.domain;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.util.Date;

public class StudentCollectNotes extends BaseDomain {

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_collect_notes.student_id
     * 创建时间 : 2018-06-14 10:15:34
     */
    private Long studentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_collect_notes.resource_id
     * 创建时间 : 2018-06-14 10:15:34
     */
    private Long packageClassId;
    private Long resourceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_collect_notes.subject_id
     * 创建时间 : 2018-06-14 10:15:34
     */
    private Long subjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_collect_notes.del_flag
     * 创建时间 : 2018-06-14 10:15:34
     */
    private Boolean delFlag;

    /**
     * student_collect_notes表的操作属性:serialVersionUID
     * 创建时间 : 2018-06-14 10:15:34
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 student_collect_notes.student_id的get方法 
     * 创建时间 : 2018-06-14 10:15:34
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * 数据字段 student_collect_notes.student_id的set方法
     * 创建时间 : 2018-06-14 10:15:34
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * 数据字段 student_collect_notes.resource_id的get方法 
     * 创建时间 : 2018-06-14 10:15:34
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * 数据字段 student_collect_notes.resource_id的set方法
     * 创建时间 : 2018-06-14 10:15:34
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 数据字段 student_collect_notes.subject_id的get方法 
     * 创建时间 : 2018-06-14 10:15:34
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * 数据字段 student_collect_notes.subject_id的set方法
     * 创建时间 : 2018-06-14 10:15:34
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * 数据字段 student_collect_notes.del_flag的get方法 
     * 创建时间 : 2018-06-14 10:15:34
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * 数据字段 student_collect_notes.del_flag的set方法
     * 创建时间 : 2018-06-14 10:15:34
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public Long getPackageClassId() {
        return packageClassId;
    }

    public void setPackageClassId(Long packageClassId) {
        this.packageClassId = packageClassId;
    }
}