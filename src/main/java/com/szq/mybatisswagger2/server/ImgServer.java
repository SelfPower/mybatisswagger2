package com.szq.mybatisswagger2.server;

import com.szq.mybatisswagger2.dao.TbsImgsMapper;

import com.szq.mybatisswagger2.domain.TbsImgs;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ImgServer {

    @Autowired
    private TbsImgsMapper tbsImgsMapper;

    public List<TbsImgs> SelAll(){

        return tbsImgsMapper.selectAll();
    }

}

