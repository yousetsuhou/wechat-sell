package com.yousetsuhou.repository;

import com.yousetsuhou.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setOrderId("12346578912");
        orderDetail.setDetailId("111111156");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductId("111112345");
        orderDetail.setProductName("鸡丝粥");
        orderDetail.setProductPrice(new BigDecimal(1.8));
        orderDetail.setProductQuantity(3);
        OrderDetail result=repository.save(orderDetail);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByOrderId()throws Exception{
        List<OrderDetail> orderDetailList= repository.findByOrderId("12346578912");
        Assert.assertNotEquals(0,orderDetailList.size());

    }
}