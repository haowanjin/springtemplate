package cn.ddupman.springstudy.bean;

public class PropertyValue {
    /**
     * 属性名称
     */
    private final String name;

    /**
     * 属性对象
     */
    private final Object value;

    /**
     * 构造器： 需要一个属性名称，一个属性对象
     */
    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    /**
     * 获取属性名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 获取属性对象
     */
    public Object getValue() {
        return this.value;
    }
}
