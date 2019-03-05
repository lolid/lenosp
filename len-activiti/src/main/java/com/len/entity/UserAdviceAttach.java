package com.len.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name="user_advice_attach")
public class UserAdviceAttach implements Serializable,Cloneable{
    /** ID */
    @Id
    @GeneratedValue
    private String id ;
    /** 关联的意见ID */
    private String refId ;
    /** 文件地址 */
    private String path ;
    /** 上传时间 */
    private Date uploadDate ;
    /** 文件标题 */
    private String fileTitile ;

    /** ID */
    public String getId(){
        return this.id;
    }
    /** ID */
    public void setId(String id){
        this.id = id;
    }
    /** 关联的意见ID */
    public String getRefId(){
        return this.refId;
    }
    /** 关联的意见ID */
    public void setRefId(String refId){
        this.refId = refId;
    }
    /** 文件地址 */
    public String getPath(){
        return this.path;
    }
    /** 文件地址 */
    public void setPath(String path){
        this.path = path;
    }
    /** 上传时间 */
    public Date getUploadDate(){
        return this.uploadDate;
    }
    /** 上传时间 */
    public void setUploadDate(Date uploadDate){
        this.uploadDate = uploadDate;
    }
    /** 文件标题 */
    public String getFileTitile(){
        return this.fileTitile;
    }
    /** 文件标题 */
    public void setFileTitile(String fileTitile){
        this.fileTitile = fileTitile;
    }
}