package com.centit.framework.staticsystem.po;

import com.centit.framework.model.basedata.IRoleInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * FRoleinfo entity.
 *
 * @author MyEclipse Persistence Tools
 */
// 角色信息表
public class RoleInfo implements IRoleInfo, java.io.Serializable{

    // Fields
    private static final long serialVersionUID = 1L;


    private String roleCode; // 角色代码


    private String roleName; // 角色名称


    private String isValid; // 是否生效

    /** 角色的类别 F （Fixe）系统内置的，固有的， G （global） 全局的
     *          P （public） 公用的，指 系统全局 和 部门之间公用的
     *          D （department）部门（机构）特有的角色
     *          I ( Item )为项目角色 W (workflow)工作流角色 ，这两个为保留类别，暂时没有使用
     *  F/G/P/D/I/W
    */
    private String roleType; // 角色类别


    private String unitCode; // 角色所属机构


    private String roleDesc; // 角色描述


    protected Date createDate;

    /**
     * CREATOR(创建人) 创建人
     */
    public RoleInfo() {
        roleType = "G";
    }

    public RoleInfo(String rolecode, String isvalid) {
        this.roleCode = rolecode;
        this.isValid = isvalid;
        this.roleType = "G";
    }

    public RoleInfo(String rolecode, String rolename,String roleType,
            String unitCode,String isvalid, String roledesc) {
        this.roleCode = rolecode;
        this.roleName = rolename;
        this.roleType = roleType;
        this.unitCode = unitCode;
        this.isValid = isvalid;
        this.roleDesc = roledesc;
    }

    // Property accessors
    public String getRoleCode() {
        return this.roleCode;
    }

    public void setRoleCode(String rolecode) {
        this.roleCode = rolecode;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public String toString() {
        return this.roleName;
    }

    public void setRoleName(String rolename) {
        this.roleName = rolename;
    }

    public String getIsValid() {
        return this.isValid;
    }

    public void setIsValid(String isvalid) {
        this.isValid = isvalid;
    }

    public String getRoleDesc() {
        return this.roleDesc;
    }

    public void setRoleDesc(String roledesc) {
        this.roleDesc = roledesc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 角色的类别 F （Fixe）系统内置的，固有的， G （global） 全局的
     *          P （public） 公用的，指 系统全局 和 部门之间公用的
     *          D （department）部门（机构）特有的角色
     *          I ( Item )为项目角色 W (workflow)工作流角色 ，这两个为保留类别，暂时没有使用
     * @return 角色的类别 F/G/P/D/I/W
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * S为系统角色 I为项目角色  D 部门权限  W工作量角色
     * @param  roleType roleType
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public String getRoleOwner() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public void copyNotNullProperty(RoleInfo other) {
        // this.rolecode = other.getRolecode();
        if (other.getRoleName() != null)
            this.roleName = other.getRoleName();
        if (other.getIsValid() != null)
            this.isValid = other.getIsValid();
        if (other.getRoleDesc() != null)
            this.roleDesc = other.getRoleDesc();
        if (other.getRoleType() != null)
            this.roleType = other.getRoleType();
        if (other.getUnitCode() != null)
            this.unitCode = other.getUnitCode();

    }

    public void copy(RoleInfo other) {
        this.roleCode = other.getRoleCode();
        this.roleName = other.getRoleName();
        this.isValid = other.getIsValid();
        this.roleDesc = other.getRoleDesc();
        this.roleType = other.getRoleType();
        this.unitCode = other.getUnitCode();

    }

    private List<RolePower> rolePowers;

    public void addRolePowers(RolePower rolePower){
        if(rolePowers==null)
            rolePowers = new ArrayList<RolePower>();
        rolePowers.add(rolePower);
    }

    @Override
    public List<RolePower> getRolePowers() {
        if(rolePowers==null)
            rolePowers = new ArrayList<RolePower>();
        return this.rolePowers;
    }

}
