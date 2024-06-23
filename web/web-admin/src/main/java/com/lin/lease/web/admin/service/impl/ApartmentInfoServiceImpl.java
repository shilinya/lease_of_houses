package com.lin.lease.web.admin.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lin.lease.model.entity.ApartmentInfo;
import com.lin.lease.web.admin.mapper.ApartmentInfoMapper;
import com.lin.lease.web.admin.service.ApartmentInfoService;
import org.springframework.stereotype.Service;

/**
 * @author liubo
 * @description 针对表【apartment_info(公寓信息表)】的数据库操作Service实现
 * @createDate 2023-07-24 15:48:00
 */
@Service
public class ApartmentInfoServiceImpl extends ServiceImpl<ApartmentInfoMapper, ApartmentInfo>
        implements ApartmentInfoService {

}



