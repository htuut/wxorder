package com.htuut.utils;

import com.htuut.vo.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object obj) {
        ResultVO resultVO = new ResultVO();
        resultVO.setMsg("成功");
        resultVO.setCode("1");
        resultVO.setData(obj);

        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }


    public static ResultVO error(String code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}
