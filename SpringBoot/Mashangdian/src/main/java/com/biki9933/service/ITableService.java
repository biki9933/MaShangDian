package com.biki9933.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.biki9933.entity.Table;

import java.util.List;
import java.util.Map;


/**
 * 桌号Service接口
 */
public interface ITableService extends IService<Table> {

    /**
     * 根据条件 分页查询
     * @param map
     * @return
     */
    public List<Table> list(Map<String,Object> map);

    /**
     * 根据条件，查询订单总记录数
     * @param map
     * @return
     */
    public Long getTotal(Map<String,Object> map);

    /**
     * 根据桌号查询
     * @param number
     * @return
     */
    public Table getByNumber(String number);

}
