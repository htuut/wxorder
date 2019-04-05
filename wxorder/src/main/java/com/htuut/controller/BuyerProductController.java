package com.htuut.controller;

import com.htuut.entity.ProductCategory;
import com.htuut.entity.ProductInfo;
import com.htuut.service.ProductCategoryService;
import com.htuut.service.ProductInfoService;
import com.htuut.utils.ResultVOUtil;
import com.htuut.vo.ProductInfoVO;
import com.htuut.vo.ProductVO;
import com.htuut.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/buyer")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping("/list")
    public ResultVO list() {

        List<ProductInfo> productInfoList = productInfoService.findUpAll();

        List<Integer> categoryTypeList = new ArrayList<>();
        for (ProductInfo productInfo : productInfoList) {
            categoryTypeList.add(productInfo.getCategoryType());
        }

        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);

        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productCategory.getCategoryType().equals(productInfo.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }

            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        ResultVO resultVO = ResultVOUtil.success(productVOList);


        return resultVO;
    }


}
