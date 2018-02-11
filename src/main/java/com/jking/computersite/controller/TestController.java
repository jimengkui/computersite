package com.jking.computersite.controller;

import com.jking.computersite.VO.ResultVO;
import com.jking.computersite.utils.PoiUtil;
import com.jking.computersite.utils.ResultVOUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class TestController {

    @ResponseBody
    @PostMapping("/saveDoc")
    public ResultVO saveDoc(@RequestParam("file") MultipartFile file){
        return ResultVOUtil.success(PoiUtil.saveDoc(file));
    }

    @ResponseBody
    @PostMapping("/delDoc")
    public ResultVO delDoc(@RequestParam("path") String path){
        PoiUtil.delDoc(path);
        return ResultVOUtil.success();
    }

    @ResponseBody
    @PostMapping("/getDoc")
    public ResultVO getDoc(@RequestParam("path") String path){
        return ResultVOUtil.success(PoiUtil.getDoc(path));
    }
}