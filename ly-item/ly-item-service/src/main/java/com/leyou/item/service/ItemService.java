package com.leyou.item.service;

import com.leyou.item.pojo.Category;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author James han
 * @create 2019-12-16 21:22
 */
@Service
public class ItemService {

    public Category saveItem(Category item){
        //新增
        int id = new Random().nextInt(100);
        item.setId(id);
        return  item;
    }
}
