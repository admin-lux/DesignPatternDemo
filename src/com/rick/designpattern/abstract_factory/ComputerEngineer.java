package com.rick.designpattern.abstract_factory;

/**
 * Created by MyPC on 2017/6/8.
 */
public class ComputerEngineer {

    private CPU cpu;
    private MainBoard mainBoard;

    public void makeComputer(AbstractFactory abstractFactory) {
        //1.准备装机的硬件
        this.prepareHardWares(abstractFactory);
        //2.组装机器
        //3.测试机器
        //4.交付客户  
    }

    private void prepareHardWares(AbstractFactory abstractFactory) {
        this.cpu = abstractFactory.createCpu();              //准备CPU，但是不关心是什么CPU
        this.mainBoard = abstractFactory.creatMainBoard();   //准备主板，也不关心是什么主板


        //查看槽孔是否和脚针数目匹配
        this.cpu.calculate();
        this.mainBoard.installCpu();
    }

}
