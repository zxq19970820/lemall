package com.zzzl.lemall.mapper;

import com.zzzl.lemall.domain.DeliveryAddress;
import com.zzzl.lemall.domain.DeliveryAddressExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DeliveryAddressMapper {
    long countByExample(DeliveryAddressExample example);

    int deleteByExample(DeliveryAddressExample example);

    int deleteByPrimaryKey(Integer deliveryId);

    int insert(DeliveryAddress record);

    int insertSelective(DeliveryAddress record);

    List<DeliveryAddress> selectByExample(DeliveryAddressExample example);

    DeliveryAddress selectByPrimaryKey(Integer deliveryId);

    int updateByExampleSelective(@Param("record") DeliveryAddress record, @Param("example") DeliveryAddressExample example);

    int updateByExample(@Param("record") DeliveryAddress record, @Param("example") DeliveryAddressExample example);

    int updateByPrimaryKeySelective(DeliveryAddress record);

    int updateByPrimaryKey(DeliveryAddress record);


//    自定义
//    根据用户id查找收获地址信息
    List<DeliveryAddress> selectDeliveryAddressByUserId(Integer id);

//    新增收货地址
    void addAddress(DeliveryAddress deliveryAddress);


    //    删除收货地址
    void DelAddress(Integer id);

    //update delivery-address
    int updateAddress(DeliveryAddress deliveryAddress);
    //selectDefaultAddressByUserId
    DeliveryAddress selectDefaultAddressByUserId(Integer userId);
}