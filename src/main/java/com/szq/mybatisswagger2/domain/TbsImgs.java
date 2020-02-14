package com.szq.mybatisswagger2.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.*;

@ApiModel(value="com.szq.mybatisswagger2.domain.TbsImgs")
@Table(name = "tbs_imgs")
public class TbsImgs implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="path")
    private String path;

    @ApiModelProperty(value="fid")
    private Long fid;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return fid
     */
    public Long getFid() {
        return fid;
    }

    /**
     * @param fid
     */
    public void setFid(Long fid) {
        this.fid = fid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", path=").append(path);
        sb.append(", fid=").append(fid);
        sb.append("]");
        return sb.toString();
    }
}