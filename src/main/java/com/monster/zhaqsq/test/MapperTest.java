package com.monster.zhaqsq.test;

import com.monster.zhaqsq.bean.CallList;
import com.monster.zhaqsq.bean.CommunityBasic;
import com.monster.zhaqsq.bean.UserAddress;
import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.dao.CallListMapper;
import com.monster.zhaqsq.dao.CommunityBasicMapper;
import com.monster.zhaqsq.dao.UserAddressMapper;
import com.monster.zhaqsq.dao.UserBasicMapper;
import com.monster.zhaqsq.service.CallListService;
import com.monster.zhaqsq.service.CommunityBasicService;
import com.monster.zhaqsq.service.UserAddressService;
import com.monster.zhaqsq.service.UserBasicService;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})




public class MapperTest {


	@Autowired
	CallListService callListService;
	
	@Autowired
	UserAddressService userAressService;
	
	@Autowired
	CallListMapper callListMapper;
	
	@Autowired
	UserAddressMapper userAddressMapper;

    @Autowired
    UserBasicService userbasicService;

    @Autowired
    UserBasicMapper userbasicMapper;

    @Autowired
    CommunityBasicService communityBasicService;

    @Autowired
    CommunityBasicMapper communityBasicMapper;


    Date time= new java.sql.Date(new java.util.Date().getTime());
	
    
    //-----------------------------------------------CallList------------------------------------------------
	@Test
	public void calupdaterec() {
		/*修改接收人*/
		callListService.changeRec(2, "asdf", 4);
	}
	
	@Test
    public void calinsert(){
        /*新增记录*/
        callListService.saveCal(new CallList(null, 2, time, time, "123", "asd", 12, "y", 5, "white", "whte","ads"));
    }

    @Test
    public void calupdate(){
        /*修改任务信息*/
        CallList callList=new CallList();
        callList.setCallId(6);
        callList.setEndTime(time);
        callList.setCallDesp("qianga");
        callList.setCallMoney(24);
        callListService.updateCallList(callList);
    }

    @Test
    public void calselect() {
        /*查询任务信息*/
        System.out.println(callListService.getinfo());
    }

    @Test
    public void caldelete() {
        /*删除记录*/
    	callListService.deletCal(2);
    }
    
    //-----------------------------UserAddress---------------------------------------------------------------
    @Test
    public void adinsert(){
        /*新增地址*/
    	userAressService.saveAd(new UserAddress(null, 5, "gwwgw", "whte"));
    }

    @Test
    public void adupdate(){
        /*修改地址*/
        userAressService.updateAd("fsdfs", "whte");
    }

    @Test
    public void adselect() {
        /*查询地址*/
        System.out.println(userAressService.getAd("white"));
    }

    @Test
    public void addelete() {
        /*删除地址*/
    	userAressService.deleteAd("white");
    }
    

    //-----------------------------------------------UserBasic------------------------------------------------------
    @Test
    public void insert(){
        /*新增记录*/
        userbasicMapper.insertSelective(new UserBasic(null, "test111", "12345", "123", null, null, null, null, null, null, null));
    }


    @Test
    public void update(){
        /*修改个人信息*/
        UserBasic userbasic = new UserBasic();
        userbasic.setUid(7);
        userbasic.setUserName("test123");
        userbasic.setUserPassword("123456789");
        userbasic.setUserSex("男");
        userbasic.setUserDesp("描述");
        userbasic.setUserMessagelevel("1");
        userbasicService.updateInfo(userbasic);
    }

    @Test
    public void select() {
        /*查询个人信息*/
        System.out.println(userbasicService.getinfo());
    }

    @Test
    public void delete() {
        /*删除记录*/
        userbasicService.deleteuser(7);
    }

    //----------------------------------------------CommunityBasic------------------------------------------------------------
    @Test
    public void coinsert(){
        /*新增社区*/
        communityBasicService.saveCom(new CommunityBasic(null, "dadfs", "xx", 12, "adas", "fadf", null));
    }

    @Test
    public void coupdate(){
        /*修改社区*/
        CommunityBasic communityBasic = new CommunityBasic();
        communityBasic.setComId(1);
        communityBasic.setComCategory("sq");
        communityBasic.setComDesp("fggas");
        communityBasic.setComNumber(42);
        communityBasicService.updateCommunityWithoutPicture(communityBasic);
    }

    @Test
    public void coselect() {
        /*查询社区*/
        System.out.println(communityBasicService.getCom("fsf"));
    }

    @Test
    public void codelete() {
        /*删除社区*/
        communityBasicService.deletCom(3);
    }
}