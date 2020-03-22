package com.devyy.oys.leetcode.controller;

import com.devyy.oys.leetcode.service.ILeetcodeScannerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @since 2019-02-06
 */
@Slf4j
@RestController
@RequestMapping("/leetcode")
@Api(tags = "Leetcode 爬虫")
public class LeetcodeController {
    @Autowired
    private ILeetcodeScannerService leetcodeScannerService;

    @ApiOperation(value = "扫描问题集")
    @PostMapping("/step1")
    public String step1() {
        return leetcodeScannerService.doScanProblems();
    }

    @ApiOperation(value = "匹配中文标题")
    @PostMapping("/step2")
    public String step2() {
        return leetcodeScannerService.doScanTiTleCn();
    }

    @ApiOperation(value = "扫描问题题目")
    @PostMapping("/step3")
    public String step3() {
        return leetcodeScannerService.doScanProblemsDetail();
    }

    @ApiOperation(value = "测试 Vuepress 渲染 Bug")
    @PostMapping("/step4")
    public String step4() {
        return leetcodeScannerService.doTestVuePressBugs();
    }

    @ApiOperation(value = "扫描图片资源")
    @PostMapping("/step5")
    public String step5() {
        return leetcodeScannerService.doScanImages();
    }

    @ApiOperation(value = "下载图片")
    @PostMapping("/step6")
    public String step6() {
        return leetcodeScannerService.doDownload();
    }

    @ApiOperation(value = "扫描 Text 文本内容")
    @PostMapping("/step7")
    public String step7() {
        return leetcodeScannerService.doScanTextContents();
    }
}