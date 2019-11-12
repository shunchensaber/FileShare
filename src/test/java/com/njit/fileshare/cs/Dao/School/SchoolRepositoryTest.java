package com.njit.fileshare.cs.Dao.School;

import com.njit.fileshare.cs.Dao.Discpline.DiscplineEntity;
import com.njit.fileshare.cs.Dao.Discpline.DiscplineRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SchoolRepositoryTest {
    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    DiscplineRepository discplineRepository;

    @Test
    public void deleteall()
    {
        schoolRepository.deleteAll();
    }

    @Test
    public void save() {
        String xueyuan = "机械工程学院 材料科学与工程学院 能源与动力工程学院 电力工程学院 自动化学院 信息与通信工程学院 计算机工程学院 经济与管理学院 建筑工程学院 艺术与设计学院 汽车与轨道交通学院 环境工程学院 马克思主义学院 人文与社会科学学院 外国语学院 数理部 体育部 工业中心 创新创业学院 国际教育学院 继续教育学院";
        String[] xueyuan1 =  xueyuan.split(" ");
        List<SchoolEntity> list = new LinkedList<>();
        for(int  i = 0;i<xueyuan1.length;i++)
        {
            SchoolEntity schoolEntity = new SchoolEntity();
            schoolEntity.setName(xueyuan1[i]);
            list.add(schoolEntity);
        }
        schoolRepository.saveAll(list);

    }
    //机械工程学院 机械电子工程专业 机械设计制造及其自动化专业 机械工程专业 过程装备与控制工程专业 机械设计制造及其自动化专业（流体传动与控制） 工业工程专业
    //材料科学与工程学院 材料科学与工程 金属材料工程 功能材料 材料成型及控制工程 焊接技术与工程 高分子材料与工程 复合材料与工程 包装工程
    //能源与动力工程学院 建筑环境与能源应用工程 核工程与核技术 能源与动力工程 建筑环境与设备工程 核工程与核技术专业 热能与动力工程
    //电力工程学院 电气工程及其自动化专业 智能电网信息工程专业 建筑电气与智能化专业 电气工程与智能控制专业 电气类（中外合作办学）
    //自动化学院 智能制造工程 自动化 机器人工程 自动化（数控技术） 测控技术与仪器
    //信息与通信工程学院 通信工程专业和电力通信专业方向  电子信息工程专业 信息工程专业 电子信息科学与技术专业 光电信息科学与工程专业
    //计算机工程学院 网络工程 软件工程 数字媒体 数据科学与大数据 电子信息科学与技术 计算机科学与技术
    //经济与管理学院 财务管理 工程管理 市场营销专业 工商管理专业 国际经济与贸易 人力资源管理专业 信息管理与信息系统专业 会计学
    //建筑工程学院 建筑学 土木工程专业 城市地下空间工程
    //艺术与设计学院 工业设计 产品设计 视觉传达设计 环境设计 工艺美术 动画
    //汽车与轨道交通学院 车辆工程 交通设备与控制工程


    //人文与社会科学学院
    //外国语学院
    //工业中心
    //创新创业学院
    //国际教育学院//马克思主义学院//环境工程学院

    @Test
    public void savediscpline()
    {
        String[] list = {"机械工程学院 机械电子工程专业 机械设计制造及其自动化专业 机械工程专业 过程装备与控制工程专业 机械设计制造及其自动化专业（流体传动与控制） 工业工程专业",
        "材料科学与工程学院 材料科学与工程 金属材料工程 功能材料 材料成型及控制工程 焊接技术与工程 高分子材料与工程 复合材料与工程 包装工程",
        "能源与动力工程学院 建筑环境与能源应用工程 核工程与核技术 能源与动力工程 建筑环境与设备工程 核工程与核技术专业 热能与动力工程",
        "电力工程学院 电气工程及其自动化专业 智能电网信息工程专业 建筑电气与智能化专业 电气工程与智能控制专业 电气类（中外合作办学）",
        "电力工程学院 电气工程及其自动化专业 智能电网信息工程专业 建筑电气与智能化专业 电气工程与智能控制专业 电气类（中外合作办学）",
        "自动化学院 智能制造工程 自动化 机器人工程 自动化（数控技术） 测控技术与仪器",
        "信息与通信工程学院 通信工程专业和电力通信专业方向 电子信息工程专业 信息工程专业 电子信息科学与技术专业 光电信息科学与工程专业",
        "计算机工程学院 网络工程 软件工程 数字媒体 数据科学与大数据 电子信息科学与技术 计算机科学与技术",
        "经济与管理学院 财务管理 工程管理 市场营销专业 工商管理专业 国际经济与贸易 人力资源管理专业 信息管理与信息系统专业 会计学",
        "建筑工程学院 建筑学 土木工程专业 城市地下空间工程",
        "艺术与设计学院 工业设计 产品设计 视觉传达设计 环境设计 工艺美术 动画",
        "汽车与轨道交通学院 车辆工程 交通设备与控制工程"};
        for(String temp:list)
        {
            String fen[] = temp.split(" ");
            SchoolEntity schoolEntity = schoolRepository.findByName(fen[0]);
            int id = schoolEntity.getId();
            for(int i =1;i<fen.length;i++)
            {
                DiscplineEntity discplineEntity = new DiscplineEntity();
                discplineEntity.setName(fen[i]);
                discplineEntity.setSchoolId(id);
                discplineRepository.save(discplineEntity);
            }
        }
    }



}