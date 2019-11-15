package com.chenli.pojo;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 用户名，账号，慕信号
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 我的头像，如果没有默认给一张
     */
    @Column(name = "face_image")
    private String faceImage;

    @Column(name = "face_image_big")
    private String faceImageBig;

    /**
     * 昵称
     */
    @Column(name = "nickname")
    private String nickname;

    /**
     * 新用户注册后默认后台生成二维码，并且上传到fastdfs
     */
    @Column(name = "qrcode")
    private String qrcode;

    @Column(name = "cid")
    private String cid;
}