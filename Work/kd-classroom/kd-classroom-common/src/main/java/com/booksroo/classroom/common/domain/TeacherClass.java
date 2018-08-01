package com.booksroo.classroom.common.domain;

import java.util.Date;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class TeacherClass extends BaseDomain{

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_class.teacher_id
     * 创建时间 : 2018-06-30 17:29:32
     */
    private Long teacherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_class.class_id
     * 创建时间 : 2018-06-30 17:29:32
     */
    private Long classId;

    /**
     * 老师教的这个班级的学科, 多门课英文逗号隔开 -- teacher_class.subject_id
     * 创建时间 : 2018-06-30 17:29:32
     */
    private String subjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_class.del_flag
     * 创建时间 : 2018-06-30 17:29:32
     */
    private Boolean delFlag;

    /**
     * teacher_class表的操作属性:serialVersionUID
     * 创建时间 : 2018-06-30 17:29:32
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 teacher_class.teacher_id的get方法
     * 创建时间 : 2018-06-30 17:29:32
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * 数据字段 teacher_class.teacher_id的set方法
     * 创建时间 : 2018-06-30 17:29:32
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 数据字段 teacher_class.class_id的get方法
     * 创建时间 : 2018-06-30 17:29:32
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * 数据字段 teacher_class.class_id的set方法
     * 创建时间 : 2018-06-30 17:29:32
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 数据字段 teacher_class.subject_id的get方法
     * 创建时间 : 2018-06-30 17:29:32
     */
    public String getSubjectId() {
        return subjectId;
    }

    /**
     * 数据字段 teacher_class.subject_id的set方法
     * 创建时间 : 2018-06-30 17:29:32
     */
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId == null ? null : subjectId.trim();
    }

    /**
     * 数据字段 teacher_class.del_flag的get方法
     * 创建时间 : 2018-06-30 17:29:32
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * 数据字段 teacher_class.del_flag的set方法
     * 创建时间 : 2018-06-30 17:29:32
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}