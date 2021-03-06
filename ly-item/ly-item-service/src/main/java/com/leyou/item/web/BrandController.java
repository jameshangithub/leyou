package com.leyou.item.web;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;
import com.leyou.item.pojo.Category;
import com.leyou.item.service.BrandService;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author James han
 * @create 2020-01-09 22:29
 */
@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    //localhost:8081/category/list?pid=0
    //localhost:10010/api/item/category/list?pid=0
    //localhost:10010/api/item/brand/page
    //localhost:8081/brand/page
    /**
     * 分页查询品牌
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @param key
     * @return
     */
    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandByPage (
            @RequestParam(value = "page",defaultValue = "1") Integer page,
            @RequestParam(value = "rows",defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy",required = false) String sortBy,
            @RequestParam(value = "desc",defaultValue = "false") boolean desc,
            @RequestParam(value = "key",required = false) String key

    ){

//        PageResult<Brand> result = brandService.queryBrandByPage(page,rows,sortBy,desc,key);
        return  ResponseEntity.ok(brandService.queryBrandByPage(page,rows,sortBy,desc,key));

    }

    /**
     * 新增品牌
     * @param brand
     * @param cids
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> saveBrand (
            Brand brand,
            @RequestParam("cids") List<Long> cids

    ){

        brandService.saveBrand(brand,cids);
        return  ResponseEntity.status(HttpStatus.CREATED).build();

    }



}
