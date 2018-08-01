package com.booksroo.classroom.common.domain;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

public class UnitTestExercises extends BaseDomain{

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit_test_exercises.unit_test_id
     * 创建时间 : 2018-07-12 15:22:12
     */
    private Long unitTestId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit_test_exercises.exercises_id
     * 创建时间 : 2018-07-12 15:22:12
     */
    private Long exercisesId;

    /**
     * unit_test_exercises表的操作属性:serialVersionUID
     * 创建时间 : 2018-07-12 15:22:12
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 unit_test_exercises.unit_test_id的get方法 
     * 创建时间 : 2018-07-12 15:22:12
     */
    public Long getUnitTestId() {
        return unitTestId;
    }

    /**
     * 数据字段 unit_test_exercises.unit_test_id的set方法
     * 创建时间 : 2018-07-12 15:22:12
     */
    public void setUnitTestId(Long unitTestId) {
        this.unitTestId = unitTestId;
    }

    /**
     * 数据字段 unit_test_exercises.exercises_id的get方法 
     * 创建时间 : 2018-07-12 15:22:12
     */
    public Long getExercisesId() {
        return exercisesId;
    }

    /**
     * 数据字段 unit_test_exercises.exercises_id的set方法
     * 创建时间 : 2018-07-12 15:22:12
     */
    public void setExercisesId(Long exercisesId) {
        this.exercisesId = exercisesId;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}