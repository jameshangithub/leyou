package com.leyou.upload.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author James han
 * @create 2020-01-16 22:14
 */
@Service
@Slf4j
public class UploadService {
    public String uploadImage(MultipartFile file) {
        try {
            //准备目标路径
            File dest = new File("D:/dev_D/upload/" + file.getOriginalFilename());
            //保存文件到本地
            file.transferTo(dest);
            //返回路径

            return  "http://image.leyou.com/image/" + file.getOriginalFilename() ;
        } catch (IOException e) {
            e.printStackTrace();
            //上传失败
            log.error("上传文件失败！" + e);
            throw new LyException(ExceptionEnum.UPLOAD_FILE_ERROR);
        }
    }
}
