package com.web.controller.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseController<T> {

    //===============页面 ================
    protected static  String EDIT_PAGE;//添加编辑页面
    protected static  String INFO_PAGE;//列表界面
    protected static  String MANAGE_PAGE;//管理界面
    protected static  String INDEX_PAGE;//主界面

    public BaseController(){
        try {

            //ParameterizedType参数化类型，即泛型
            //com.web.controller.base.BaseController<com.web.controller.UserController>
            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();

            //获取泛型真实类型 Ljava.lang.reflect.Type;@cd10a9b
            Type[] types = pt.getActualTypeArguments();

            //把type类型赋值给Class类型 class com.web.controller.UserController
            Class<T> clz = (Class<T>) types[0];
            //定义页面的静态变量
            String modelName = clz.getSimpleName().toLowerCase();
            EDIT_PAGE = modelName + "/edit";
            INFO_PAGE = modelName + "/info";
            MANAGE_PAGE = modelName + "/manage";
            INDEX_PAGE="index";
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
