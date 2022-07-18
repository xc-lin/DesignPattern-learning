package com.lxc.prototype.deepClone;

import java.io.*;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class DeepProtoType implements Serializable, Cloneable {
    public String name;

    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }

    // 深拷贝 方式一，使用clone方法


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 完成对基本数据类型和字符串的克隆
        deep = super.clone();
        // 对引用数据类型，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deep;


    }


    // 方式二 通过对象的序列化实现 （推荐）

    public Object deepClone() throws IOException {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos =null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois =null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 当前这个对象以对象流的形式输出
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois =new ObjectInputStream(bis);
            Object object = ois.readObject();

            return object;
        }catch (Exception e){
            return null;
        }
        finally {
            bos.close();
            oos.close();
            bis.close();
            ois.close();
        }
    }
}
