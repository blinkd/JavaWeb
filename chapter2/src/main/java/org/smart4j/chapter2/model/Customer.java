package org.smart4j.chapter2.model;

/**
 *�ͻ���  ���ݿ�洢��ز���
 */

public class Customer {
    /**
     *����ID
     */
    private long id;

    /**
     *�ͻ�����
     */
    private String name;

    /**
     *��ϵ��
     */
    private String contact;

    /**
     *�绰����
     */
    private String telephone;

    /**
     *�����ַ
     */
    private String email;

    /**
     *��ע
     */
    private String remark;

    // get������set����
    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getRemark() {
        return remark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
