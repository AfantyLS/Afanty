package com.booksroo.classroom.common.domain;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

public class ExerciseDomain implements Serializable {
    /**
     * 习题ID -- exercise_info.id
     * 创建时间 : 2018-07-09 20:01:40
     */
    private Long id;

    /**
     * 创建人ID -- exercise_info.teacher_id
     * 创建时间 : 2018-07-09 20:01:40
     */
    private Long teacherId;

    /**
     * 习题类型（1.选择题 2.判断题 3.填空题 4.主观题） -- exercise_info.type
     * 创建时间 : 2018-07-09 20:01:40
     */
    private Byte type;

    /**
     * 习题内容 -- exercise_info.content
     * 创建时间 : 2018-07-09 20:01:40
     */
    private String content;

    /**
     * 习题图片地址 -- exercise_info.content_url
     * 创建时间 : 2018-07-09 20:01:40
     */
    private String contentUrl;

    /**
     * 习题分析内容 -- exercise_info.analyze
     * 创建时间 : 2018-07-09 20:01:40
     */
    private String analyze;

    /**
     * 习题分析图片地址 -- exercise_info.analyze_url
     * 创建时间 : 2018-07-09 20:01:40
     */
    private String analyzeUrl;

    /**
     * 习题答案 -- exercise_info.answer
     * 创建时间 : 2018-07-09 20:01:40
     */
    private String answer;

    /**
     * 习题答案数据 -- exercise_info.answer_num
     * 创建时间 : 2018-07-09 20:01:40
     */
    private Byte answerNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exercise_info.create_time
     * 创建时间 : 2018-07-09 20:01:40
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exercise_info.update_time
     * 创建时间 : 2018-07-09 20:01:40
     */
    private Date updateTime;

    /**
     * 是否删除（0-否 1-是） -- exercise_info.del_flag
     * 创建时间 : 2018-07-09 20:01:40
     */
    private Boolean delFlag;

    /**
     * exercise_info表的操作属性:serialVersionUID
     * 创建时间 : 2018-07-09 20:01:40
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 exercise_info.id的get方法 
     * 创建时间 : 2018-07-09 20:01:40
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 exercise_info.id的set方法
     * 创建时间 : 2018-07-09 20:01:40
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 exercise_info.teacher_id的get方法 
     * 创建时间 : 2018-07-09 20:01:40
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * 数据字段 exercise_info.teacher_id的set方法
     * 创建时间 : 2018-07-09 20:01:40
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 数据字段 exercise_info.type的get方法 
     * 创建时间 : 2018-07-09 20:01:40
     */
    public Byte getType() {
        return type;
    }

    /**
     * 数据字段 exercise_info.type的set方法
     * 创建时间 : 2018-07-09 20:01:40
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 数据字段 exercise_info.content的get方法 
     * 创建时间 : 2018-07-09 20:01:40
     */
    public String getContent() {
        return content;
    }

    /**
     * 数据字段 exercise_info.content的set方法
     * 创建时间 : 2018-07-09 20:01:40
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 数据字段 exercise_info.content_url的get方法 
     * 创建时间 : 2018-07-09 20:01:40
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * 数据字段 exercise_info.content_url的set方法
     * 创建时间 : 2018-07-09 20:01:40
     */
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl == null ? null : contentUrl.trim();
    }

    /**
     * 数据字段 exercise_info.analyze的get方法 
     * 创建时间 : 2018-07-09 20:01:40
     */
    public String getAnalyze() {
        return analyze;
    }

    /**
     * 数据字段 exercise_info.analyze的set方法
     * 创建时间 : 2018-07-09 20:01:40
     */
    public void setAnalyze(String analyze) {
        this.analyze = analyze == null ? null : analyze.trim();
    }

    /**
     * 数据字段 exercise_info.analyze_url的get方法 
     * 创建时间 : 2018-07-09 20:01:40
     */
    public String getAnalyzeUrl() {
        return analyzeUrl;
    }

    /**
     * 数据字段 exercise_info.analyze_url的set方法
     * 创建时间 : 2018-07-09 20:01:40
     */
    public void setAnalyzeUrl(String analyzeUrl) {
        this.analyzeUrl = analyzeUrl == null ? null : analyzeUrl.trim();
    }

    /**
     * 数据字段 exercise_info.answer的get方法 
     * 创建时间 : 2018-07-09 20:01:40
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 数据字段 exercise_info.answer的set方法
     * 创建时间 : 2018-07-09 20:01:40
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    /**
     * 数据字段 exercise_info.answer_num的get方法 
     * 创建时间 : 2018-07-09 20:01:40
     */
    public Byte getAnswerNum() {
        return answerNum;
    }

    /**
     * 数据字段 exercise_info.answer_num的set方法
     * 创建时间 : 2018-07-09 20:01:40
     */
    public void setAnswerNum(Byte answerNum) {
        this.answerNum = answerNum;
    }

    /**
     * 数据字段 exercise_info.create_time的get方法 
     * 创建时间 : 2018-07-09 20:01:40
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 数据字段 exercise_info.create_time的set方法
     * 创建时间 : 2018-07-09 20:01:40
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 数据字段 exercise_info.update_time的get方法 
     * 创建时间 : 2018-07-09 20:01:40
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 数据字段 exercise_info.update_time的set方法
     * 创建时间 : 2018-07-09 20:01:40
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 数据字段 exercise_info.del_flag的get方法 
     * 创建时间 : 2018-07-09 20:01:40
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * 数据字段 exercise_info.del_flag的set方法
     * 创建时间 : 2018-07-09 20:01:40
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}