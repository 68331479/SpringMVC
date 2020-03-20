package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;


/**
 * @Author: LDeng
 * @Date: 2020-03-17 14:42
 */
@RestController
public class FileController {

    @RequestMapping("/upload")
    public String upload(@RequestParam("file")CommonsMultipartFile file,
                         HttpServletRequest request) throws IOException {
        String uploadFileName=file.getOriginalFilename();
        //如果名字为空返回首页
        if("".equals(uploadFileName)){
            return "redirect:/index.jsp";
        }
        System.out.println("文件上传===>"+uploadFileName);
        //上传路径
        String path = request.getServletContext().getRealPath("/upload");
        File realPath=new File(path);
        if(!realPath.exists()){
            realPath.mkdir();
        }

        System.out.println("上传文件的保存地址为====》"+realPath);

        InputStream is=file.getInputStream();
        OutputStream os=new FileOutputStream(new File(realPath,uploadFileName));

        //读取写出
        int len=0;
        byte[] buffer=new byte[1024];
        while ((len=is.read(buffer))!=-1){
            os.write(buffer,0,len);
            os.flush();
        }
        os.close();
        is.close();
        return "redirect:/index.jsp";

    }

    @RequestMapping("/upload2")
    public String fileupload2(@RequestParam("file") CommonsMultipartFile file,
                              HttpServletRequest request) throws IOException {
        //上传路径保存设置
        String path=request.getServletContext().getRealPath("/upload");
        File realPath=new File(path);
        if(!realPath.exists()){
            realPath.mkdir();
        }

        System.out.println("上传文件的保存地址为====》"+realPath);

        file.transferTo(new File(realPath+"/"+file.getOriginalFilename()));
        return "redirect:/index.jsp";

    }
}
