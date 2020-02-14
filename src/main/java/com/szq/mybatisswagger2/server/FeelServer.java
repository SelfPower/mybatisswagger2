package com.szq.mybatisswagger2.server;

import com.szq.mybatisswagger2.dao.TbsFeelMapper;
import com.szq.mybatisswagger2.domain.TbsFeel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeelServer {
    @Autowired
    private TbsFeelMapper tbsFeelMapper;

    public List<TbsFeel> SelAll(){
        List<TbsFeel> tbsFeels = tbsFeelMapper.selectAll();
        return tbsFeels;
    }

}
