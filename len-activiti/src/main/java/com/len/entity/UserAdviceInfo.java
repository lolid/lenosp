package com.len.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name="user_advice_info")
public class UserAdviceInfo implements Serializable,Cloneable{
    /** ID */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "JDBC")
    private String id ;
    /** 标题 */
    @Column(name = "title")
    private String title ;
    /** 紧急程度 */
    @Column(name = "urgency_degree")
    private String urgencyDegree ;
    /** 更新时间 */
    @Column(name = "update_time")
    private Date updatedTime ;
    /** 更新人 */
    @Column(name = "update_by")
    private String updatedBy ;
    /** 创建时间 */
    @Column(name = "created_time")
    private Date createdTime ;
    /** 联系人 */
    @Column(name = "contact_user")
    private String contactUser ;
    /** 联系电话 */
    @Column(name = "phone_number")
    private String phoneNumber ;
    /** 意见概述 */
    @Column(name = "advice_detail")
    private String adviceDetail ;

    /** ID */
    public String getId(){
        return this.id;
    }
    /** ID */
    public void setId(String id){
        this.id = id;
    }
    /** 标题 */
    public String getTitle(){
        return this.title;
    }
    /** 标题 */
    public void setTitle(String title){
        this.title = title;
    }
    /** 紧急程度 */
    public String getUrgencyDegree(){
        return this.urgencyDegree;
    }
    /** 紧急程度 */
    public void setUrgencyDegree(String urgencyDegree){
        this.urgencyDegree = urgencyDegree;
    }
    /** 更新时间 */
    public Date getUpdatedTime(){
        return this.updatedTime;
    }
    /** 更新时间 */
    public void setUpdatedTime(Date updatedTime){
        this.updatedTime = updatedTime;
    }
    /** 更新人 */
    public String getUpdatedBy(){
        return this.updatedBy;
    }
    /** 更新人 */
    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }
    /** 创建时间 */
    public Date getCreatedTime(){
        return this.createdTime;
    }
    /** 创建时间 */
    public void setCreatedTime(Date createdTime){
        this.createdTime = createdTime;
    }
    /** 联系人 */
    public String getContactUser(){
        return this.contactUser;
    }
    /** 联系人 */
    public void setContactUser(String contactUser){
        this.contactUser = contactUser;
    }
    /** 联系电话 */
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    /** 联系电话 */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    /** 意见概述 */
    public String getAdviceDetail(){
        return this.adviceDetail;
    }
    /** 意见概述 */
    public void setAdviceDetail(String adviceDetail){
        this.adviceDetail = adviceDetail;
    }
}