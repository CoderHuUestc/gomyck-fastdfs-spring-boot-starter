

package com.gomyck.fastdfs.starter.database;

import com.gomyck.fastdfs.starter.database.entity.CkFileInfo;
import com.gomyck.util.R;

import java.util.List;

/**
 * @author gomyck QQ:474798383
 * @version [版本号/1.0]
 * @see [相关类/方法]
 * @since [2019-07-24]
 */
public interface UploadService {

    /**
     * 保存已完成上传的文件信息(向已完成的文件列表中加入)
     * @param fileInfo
     * @return
     */
    R saveUploadInfo(CkFileInfo fileInfo);

    /**
     * 查询已上传完成的文件列表(查询已完成上传的文件列表)
     * @return
     */
    List<CkFileInfo> selectCompleteFileInfo();

    /**
     * 删除文件(单个, 从已完成列表中删除)
     * @param messageDigest
     * @return
     */
    R delFile(CkFileInfo messageDigest);


    /**
     * 根据摘要, 获取文件信息(已完成列表中获取)
     * @param fileMd5
     * @return
     */
    CkFileInfo getFileByMessageDigest(String fileMd5);


    //--------------以下为上传辅助接口, 为了保存单个文件上传临时状态-----------

    /**
     * 保存单个文件上传状态
     * @param fileInfo 文件信息
     * @return
     */
    R saveFileUploadStatus(CkFileInfo fileInfo);

    /**
     * 删除单个文件上传状态
     * @param fileMd5
     * @return
     */
    R delFileUploadStatus(String fileMd5);

    /**
     * 获取文件上传状态
     * @param fileMd5
     * @return
     */
    CkFileInfo getFileUploadStatus(String fileMd5);

}
